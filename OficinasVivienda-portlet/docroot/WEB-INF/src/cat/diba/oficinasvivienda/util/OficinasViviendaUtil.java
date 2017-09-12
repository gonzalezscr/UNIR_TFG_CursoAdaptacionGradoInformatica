package cat.diba.oficinasvivienda.util;

import cat.diba.oficinasvivienda.model.Municipio;
import cat.diba.oficinasvivienda.model.OficinaServicioMunicipio;
import cat.diba.oficinasvivienda.service.MunicipioLocalServiceUtil;
import cat.diba.oficinasvivienda.service.OficinaServicioMunicipioLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.kernel.xml.Node;
import com.liferay.portal.kernel.xml.SAXReader;
import com.liferay.portal.kernel.xml.SAXReaderUtil;
import com.liferay.portlet.asset.model.AssetEntry;
import com.liferay.portlet.asset.service.AssetEntryLocalServiceUtil;
import com.liferay.portlet.asset.service.persistence.AssetEntryQuery;
import com.liferay.portlet.dynamicdatamapping.model.DDMStructure;
import com.liferay.portlet.dynamicdatamapping.model.DDMTemplate;
import com.liferay.portlet.dynamicdatamapping.service.DDMStructureLocalServiceUtil;
import com.liferay.portlet.dynamicdatamapping.service.DDMTemplateLocalServiceUtil;
import com.liferay.portlet.journal.model.JournalArticle;
import com.liferay.portlet.journal.service.JournalArticleLocalServiceUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class OficinasViviendaUtil {

	private static Log LOG = LogFactoryUtil.getLog(OficinasViviendaUtil.class);

	public static final String ddmStructureName = "OFICINA_HABITATGE";
	public static final String ddmTemplateName = "OFICINA_HABITATGE";
	public static final String nameStructureTemplate = "<?xml version='1.0' encoding='UTF-8'?><root available-locales=\"ca_ES\" default-locale=\"ca_ES\"><Name language-id=\"ca_ES\">%s</Name></root>";
	public static final long groupIdHUA = 479934;
	public static final String ddmTemplateNameMailing = "OFICINA_HABITATGE_MAILING";
	
	public static DDMStructure obtenerEstructura(String name, long scopeGroupId) {
		DDMStructure retorn = null;
		try {
			List<DDMStructure> structure = DDMStructureLocalServiceUtil
					.getStructure(scopeGroupId,
							String.format(nameStructureTemplate, name), "");
			if (structure.size() > 0) {
				retorn = structure.get(0);
			}
		} catch (SystemException e) {
			LOG.error("Error al obtener la estructura " + name);
		}
		return retorn;
	}
	
	public static DDMTemplate obtenirTemplate(String name, long scopeGroupId) {
		DDMTemplate retorn = null;

		DynamicQuery q = DynamicQueryFactoryUtil.forClass(DDMTemplate.class)
				.add(PropertyFactoryUtil.forName("name").like(
						String.format(nameStructureTemplate, name)));
		q.add(RestrictionsFactoryUtil.eq("groupId", scopeGroupId));

		try {
			List<DDMTemplate> templates = DDMTemplateLocalServiceUtil
					.dynamicQuery(q);
			retorn = templates.get(0);
		} catch (SystemException e) {
			LOG.error("Error al obtenir el template " + name);
		}

		return retorn;
	}

	public static String obtenirTemplateKey(String name, long scopeGroupId) {
		String retorn = StringPool.BLANK;
		DDMTemplate structure = obtenirTemplate(name, scopeGroupId);
		if (structure != null) {
			retorn = structure.getTemplateKey();
		}
		return retorn;
	}

	public static List<JournalArticle> obtenerOficinas(long scopeGroupId,
			int start, int end) {
		List<JournalArticle> articles = new ArrayList<JournalArticle>();

		AssetEntryQuery assetEntryQuery = new AssetEntryQuery();
		long[] groupsIds = new long[1];
		groupsIds[0] = scopeGroupId;

		DDMStructure estructura = obtenerEstructura(ddmStructureName,
				groupsIds[0]);
		if (estructura == null) {
			return articles;
		}
		assetEntryQuery.setGroupIds(groupsIds);
		assetEntryQuery.setPublishDate(new Date());
		assetEntryQuery.setExpirationDate(new Date());
		long[] classTypeIds = new long[1];
		classTypeIds[0] = estructura.getStructureId();
		assetEntryQuery.setClassTypeIds(classTypeIds);
		assetEntryQuery.setStart(start);
		assetEntryQuery.setEnd(end);
		assetEntryQuery.setClassName(JournalArticle.class.getName());
		assetEntryQuery.setOrderByCol1("title");
		assetEntryQuery.setOrderByType1("asc");

		try {

			// Obtener todos los articulos
			List<AssetEntry> listaAssets = AssetEntryLocalServiceUtil
					.getEntries(assetEntryQuery);

			for (AssetEntry assetEntry : listaAssets) {
				try {
					JournalArticle article = JournalArticleLocalServiceUtil
							.getLatestArticle(assetEntry.getClassPK(),
									WorkflowConstants.STATUS_APPROVED);
					articles.add(article);
				} catch (Exception e) {
					LOG.debug("No se ha podido cargar un articulo en la busqueda ",
							e);
				}
			}

		} catch (SystemException e) {
			LOG.error("Error al obtener las oficinas");
		}

		LOG.debug("#Ofincinas=" + articles.size());
		return articles;

	}
	
	public static int obtenerOficinasTotal(long scopeGroupId) {
		List<JournalArticle> articles = obtenerOficinas(scopeGroupId, 
				QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		return articles.size();

	}

	public static boolean isMapFieldEmpty(Map<Locale, String> field) {
		boolean isEmptyTitle = true;
		for (String value : field.values()) {
			if (value != null && !value.trim().equals(StringPool.BLANK)) {
				isEmptyTitle = false;
			}
		}
		return isEmptyTitle;
	}

	public static String obtenerMunicipiosTexto(long companyId, long groupId, long idOficina, long idServicio)
			throws PortalException, SystemException {
		String retorn = StringPool.BLANK;

		List<OficinaServicioMunicipio> listaMunicipios = OficinaServicioMunicipioLocalServiceUtil
				.obtenerMunicipiosPorOficinaServicio(companyId, groupId, idOficina, idServicio);
		for (OficinaServicioMunicipio osm : listaMunicipios) {
			if (!osm.getCodigoIne().equals("0")) {
				Municipio mun = MunicipioLocalServiceUtil.getMunicipio(osm
						.getCodigoIne());
				if( !retorn.isEmpty()){
					retorn = retorn + ", " ;
				}
				retorn =  retorn + mun.getNombre();
			}
		}
		return retorn;
	}
	
	
	public static String getValorCampEstructura(JournalArticle journalArticle,
			String camp, String idioma) {
		if (LOG.isDebugEnabled()) {
			LOG.debug("getValorCampEstructura");
		}
		try {
			String xml = journalArticle.getContentByLocale(idioma);
			SAXReader reader = SAXReaderUtil.getSAXReader();
			String[] fields = camp.split("\\.");
			com.liferay.portal.kernel.xml.Document doc = reader.read(xml);

			Node elt = doc;

			for (String field : fields) {
				elt = elt
						.selectSingleNode(getXPathExpression(doc == elt, field));
			}

			Node node = elt.selectSingleNode("./dynamic-content");

			return  node.getText();
		} catch (Exception e) {
			return  StringPool.BLANK ;
		}
	}

	private static final String getXPathExpression(boolean isRoot, String field) {
		if (LOG.isDebugEnabled()) {
			LOG.debug("getXPathExpression");
		}
		if (isRoot) {
			return String.format("//dynamic-element[@name='%s']", field);
		} else {
			return String.format("./dynamic-element[@name='%s']", field);
		}
	}

}