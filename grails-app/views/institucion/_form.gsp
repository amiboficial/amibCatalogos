<%@ page import="mx.amib.sistemas.catalogos.general.model.catalog.Institucion" %>



<div class="fieldcontain ${hasErrors(bean: institucionInstance, field: 'nombre', 'error')} required">
	<label for="nombre">
		<g:message code="institucion.nombre.label" default="Nombre" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="descripcion" cols="20" rows="1" maxlength="100" required="" value="${figuraInstance?.descripcion}"/>

</div></br>

<div class="fieldcontain ${hasErrors(bean: institucionInstance, field: 'tipoInstitucion', 'error')} required">
	<label for="tipoInstitucion">
		<g:message code="institucion.tipoInstitucion.label" default="Tipo Institucion" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="tipoInstitucion" name="tipoInstitucion.id" from="${mx.amib.sistemas.catalogos.general.model.catalog.TipoInstitucion.list()}" optionKey="id" required="" value="${institucionInstance?.tipoInstitucion?.id}" class="many-to-one"/>

</div></br>

<div class="fieldcontain ${hasErrors(bean: institucionInstance, field: 'vigente', 'error')} ">
	<label for="vigente">
		<g:message code="institucion.vigente.label" default="Vigente" />
		
	</label>
	<g:checkBox name="vigente" value="${institucionInstance?.vigente}" />

</div>

