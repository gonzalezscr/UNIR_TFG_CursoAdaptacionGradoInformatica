<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>  
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.portlet.journal.model.JournalArticle"%>
<%@page import="com.liferay.portal.util.PortalUtil" %>
<%@page import="com.liferay.portal.theme.ThemeDisplay" %>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="cat.diba.oficinasvivienda.util.OficinasViviendaUtil"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.util.portlet.PortletRequestUtil"%>
<%@page import="cat.diba.oficinasvivienda.service.ServicioLocalServiceUtil"%>
<%@page import="cat.diba.oficinasvivienda.util.Parametros"%>
<%@page import="cat.diba.oficinasvivienda.model.Servicio"%>
<%@page import="cat.diba.oficinasvivienda.model.impl.ServicioImpl"%> 
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="cat.diba.oficinasvivienda.service.TipoLocalServiceUtil"%>
<%@page import="cat.diba.oficinasvivienda.model.Tipo"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="cat.diba.oficinasvivienda.service.OficinaTipoLocalServiceUtil"%>
<%@page import="cat.diba.oficinasvivienda.model.OficinaTipo"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="com.liferay.portal.kernel.util.KeyValuePairComparator"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="com.liferay.portal.kernel.util.KeyValuePair"%>
<%@page import="cat.diba.oficinasvivienda.model.Municipio"%>
<%@page import="cat.diba.oficinasvivienda.service.MunicipioLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.HtmlUtil"%>
<%@page import="cat.diba.oficinasvivienda.model.OficinaServicioMunicipio"%>
<%@page import="cat.diba.oficinasvivienda.service.OficinaServicioMunicipioLocalServiceUtil"%>
<%@page import="java.util.Arrays"%>
<%@page import="com.liferay.portlet.journal.model.JournalArticleDisplay"%>
<%@page	import="com.liferay.portlet.journalcontent.util.JournalContentUtil"%>
<%@page import="com.liferay.portal.kernel.util.Constants"%>

<portlet:defineObjects />
<liferay-theme:defineObjects/>