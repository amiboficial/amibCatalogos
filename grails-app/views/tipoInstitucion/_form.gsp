<%@ page import="mx.amib.sistemas.catalogos.general.model.catalog.TipoInstitucion" %>



<div class="fieldcontain ${hasErrors(bean: tipoInstitucionInstance, field: 'descripcion', 'error')} ">
	<label for="descripcion">
		<g:message code="tipoInstitucion.descripcion.label" default="Descripcion" />
		
	</label>
	<g:textField name="descripcion" maxlength="100" value="${tipoInstitucionInstance?.descripcion}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: tipoInstitucionInstance, field: 'vigente', 'error')} ">
	<label for="vigente">
		<g:message code="tipoInstitucion.vigente.label" default="Vigente" />
		
	</label>
	<g:checkBox name="vigente" value="${tipoInstitucionInstance?.vigente}" />

</div>

