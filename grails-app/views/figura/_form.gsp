<%@ page import="mx.amib.sistemas.catalogos.general.model.catalog.Figura" %>



<div class="fieldcontain ${hasErrors(bean: figuraInstance, field: 'descripcion', 'error')} required">
	<label for="descripcion">
		<g:message code="figura.descripcion.label" default="Descripcion" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="descripcion" cols="20" rows="1" maxlength="100" required="" value="${figuraInstance?.descripcion}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: figuraInstance, field: 'vigente', 'error')} ">
	<label for="vigente"></br>
		<g:message code="figura.vigente.label" default="Vigente" /></br>
		
	</label>
	<g:checkBox name="vigente" value="${figuraInstance?.vigente}" />

</div>

