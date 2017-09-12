<%@ include file="/html/oficinasviviendaadministracion/init.jsp"%>

<%
	long idOficina = ParamUtil.getLong(request, Parametros.FIELD_IDOFICINA);
	String nombreOficina = ParamUtil.getString(request, Parametros.FIELD_NOMBRE);
	
	List <Tipo> listaTiposOficina = TipoLocalServiceUtil.obtenerTipos(	
			PortalUtil.getCompanyId(request),
			PortalUtil.getScopeGroupId(request),
			QueryUtil.ALL_POS, QueryUtil.ALL_POS);

	long idTipo = OficinaTipoLocalServiceUtil.obtenerTipoPorOficina(
			PortalUtil.getCompanyId(request),
			PortalUtil.getScopeGroupId(request),
			idOficina);
%>

<liferay-portlet:renderURL var="cancelar">
	<liferay-portlet:param name="mvcPath"
		value="/html/oficinasviviendaadministracion/view.jsp" />
</liferay-portlet:renderURL>

<portlet:actionURL name='guardarOficina' var="guardarOficinaURL" />

<div class="taglib-header">
	<h3 class="header-title"><%=nombreOficina%></h3>
</div>
<aui:form name="fm" action="<%=guardarOficinaURL.toString()%>"
	method="post">
	<aui:input name="<%=Parametros.FIELD_IDOFICINA%>" type="hidden"
		value="<%=idOficina%>" />

	<aui:select label='<%=LanguageUtil.get(pageContext, "tipo-oficina")%>'
		name='<%=Parametros.FIELD_IDTIPO%>' required="true"
		showEmptyOption='true'>
		<%
			for (Tipo tipo : listaTiposOficina) {
		%>
		<aui:option label="<%=tipo.getNombre(locale)%>"
			value='<%=tipo.getIdTipo()%>'
			selected="<%=(idTipo == tipo.getIdTipo())%>" />
		<%
			}
		%>
	</aui:select>
	<%
		List <Servicio> listaServicios = ServicioLocalServiceUtil.
				obtenerServicios(	
						PortalUtil.getCompanyId(request),
						PortalUtil.getScopeGroupId(request),
						QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		
		List<OficinaServicioMunicipio> listaServiciosSeleccionados = OficinaServicioMunicipioLocalServiceUtil
			.obtenerServiciosPorOficina(PortalUtil.getCompanyId(request),
					PortalUtil.getScopeGroupId(request),idOficina, 
					QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		
		//Generació de llistes
		List<KeyValuePair> serviciosLeftList = new ArrayList<KeyValuePair>();
		List<KeyValuePair> serviciosRightList = new ArrayList<KeyValuePair>();
		//Lista IdServicios seleccionados
		List<Long> listaIdServ = new ArrayList<Long>();
		
		for(OficinaServicioMunicipio osm :listaServiciosSeleccionados){
			Servicio serv = ServicioLocalServiceUtil.getServicio(osm.getIdServicio());
			serviciosLeftList.add(new KeyValuePair(String.valueOf(osm.getIdServicio()), 
				 HtmlUtil.escape(serv.getNombre(locale))));
			listaIdServ.add(osm.getIdServicio());
		}
		
		
		for (Servicio servicio : listaServicios) {
			if ( !listaIdServ.contains(servicio.getIdServicio())){
				serviciosRightList.add(new KeyValuePair(String.valueOf(servicio.getIdServicio()),
						HtmlUtil.escape(servicio.getNombre(locale))));
			}
		}
		serviciosRightList = ListUtil.sort(serviciosRightList, new KeyValuePairComparator(false, true));
	%>
	<aui:input name="<%=Parametros.FIELD_SERVICIOSID %>" type="hidden" />
	<liferay-ui:input-move-boxes
		leftTitle='<%=LanguageUtil.get(pageContext, "servicio-seleccionados")%>'
		rightTitle='<%=LanguageUtil.get(pageContext, "servicio-disponibles")%>'
		leftBoxName="<%=Parametros.FIELD_CURRENTSERVICIOSID %>" 
		rightBoxName="<%=Parametros.FIELD_AVAILABLESERVICIOSID %>"
		leftList="<%=serviciosLeftList%>"
		rightList="<%=serviciosRightList%>" />

	<aui:button name="submit" type="submit" value="save"
		onClick='<%=renderResponse.getNamespace() + "customSubmit();" %>' />
	<aui:button href="<%=cancelar.toString()%>" type="cancel" />
</aui:form>

<aui:script>
		Liferay.provide(
				window,
				'<portlet:namespace />customSubmit',
				function() {
				
 					if (document.<portlet:namespace />fm.<portlet:namespace /><%=Parametros.FIELD_SERVICIOSID %>) {
 						document.<portlet:namespace />fm.<portlet:namespace /><%=Parametros.FIELD_SERVICIOSID %>.value = Liferay.Util.listSelect(document.<portlet:namespace />fm.<portlet:namespace /><%=Parametros.FIELD_CURRENTSERVICIOSID %>);
 					}
					submitForm(document.<portlet:namespace />fm);
				},
				['liferay-util-list-fields']
			);
	
		
	</aui:script>




