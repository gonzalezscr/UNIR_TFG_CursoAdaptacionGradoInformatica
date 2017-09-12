<%@ include file="/html/oficinasviviendaadministracion/init.jsp"%>

<div class="taglib-header">
	<h3 class="header-title"><%=LanguageUtil.get(pageContext, "oficina-listado")%></h3>
</div>

<!--  ACCIONES -->
<liferay-portlet:renderURL  var="mantenimientoServicio" >
	<liferay-portlet:param name="mvcPath" value="/html/oficinasviviendaadministracion/listadoServicio.jsp"/>
</liferay-portlet:renderURL>
<liferay-portlet:renderURL  var="mantenimientTipo" >
	<liferay-portlet:param name="mvcPath" value="/html/oficinasviviendaadministracion/listadoTipo.jsp"/>
</liferay-portlet:renderURL>
<portlet:actionURL name='enviarMailing' var="enviarMailingURL" />


<div>
	<a class="btn btn-primary" href="<%=mantenimientoServicio%>"><%=LanguageUtil.get(pageContext, "servicio-mantenimiento")%></a>
	<a class="btn btn-primary" href="<%=mantenimientTipo%>"><%=LanguageUtil.get(pageContext, "tipo-mantenimiento")%></a>
	<% String mailConfirm = "javascript:confirmMailing()"; %>
	<a class="btn btn-primary" href="<%=mailConfirm%>"><%=LanguageUtil.get(pageContext, "oficina-enviarMailing")%></a>
</div>

<liferay-portlet:renderURL varImpl="paginationURL">
	<liferay-portlet:param name="mvcPath"
		value="/html/oficinasviviendaadministracion/view.jsp" />
</liferay-portlet:renderURL>

<liferay-ui:search-container iteratorURL="<%=paginationURL%>"
	deltaConfigurable="true" delta="<%=Parametros.DELTA_GENERAL%>"
	emptyResultsMessage="oficina-no-resultados">

	<liferay-ui:search-container-results
		results="<%=OficinasViviendaUtil.obtenerOficinas(
						PortalUtil.getScopeGroupId(request),
						searchContainer.getStart(), searchContainer.getEnd())%>"
		total="<%=OficinasViviendaUtil.obtenerOficinasTotal(
						PortalUtil.getScopeGroupId(request))%>" />

	<liferay-ui:search-container-row
		className="com.liferay.portlet.journal.model.JournalArticle"
		keyProperty="articleId" modelVar="oficina">
		<liferay-ui:search-container-column-text name="identificador" >
			<%=oficina.getArticleId()%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="name">
			<%=oficina.getTitle(locale)%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="">
			<%@include file="/html/oficinasviviendaadministracion/accionesOficina.jsp"%>
		</liferay-ui:search-container-column-text>
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator searchContainer="<%=searchContainer%>"
		paginate="<%=true%>" />
</liferay-ui:search-container>


<script type="text/javascript">
function confirmMailing() {
	msg = "<%=LanguageUtil.get(pageContext, "mail-boton")%>";
	if(confirm(msg)) {
		window.location.href = '<%=enviarMailingURL.toString()%>';
	} else {
		return false;
	}
}
</script>
