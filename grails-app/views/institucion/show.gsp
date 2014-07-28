
<%@ page import="mx.amib.sistemas.catalogos.general.model.catalog.Institucion" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'institucion.label', default: 'Institucion')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<ul class="breadcrumb">
           <li><a href="#">Acciones</a><span class="divider"></span></li>
           <li><a href="#">Búsqueda de Registros</a></li>
		</ul>
	 	<fieldset>
			<div class="panel panel-default col-lg-12">
           		<div class="panel-heading">
					<h2 class="panel-title">Acciones</h2>
					</div></br>
						 <ul class="nav navbar-nav navbar-center">
							<!-- <a href="#create-institucion" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a> -->
						    <!--<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li> -->
							<li><g:link class="list btn btn-primary colortitle colorblack" action="index">Gestion institución</g:link></li>
						</ul></br>
			</div>
		</fieldset>
		
		
		<fieldset>
   			<div class="panel panel-default col-lg-12">
            	<div class="panel-heading">	
                	<div class="widgetTitle">
						<div id="show-institucion" class="content scaffold-show" role="main">
							<h1>Mostrar institución</h1>
							<g:if test="${flash.message}">
								<div class="message" role="status">${flash.message}</div>
							</g:if>
						</div></br>
					</div>
				</div>
				<ol class="property-list institucion"></br>
					<g:if test="${institucionInstance?.nombre}">
						<li class="fieldcontain">
							<span id="nombre-label" class="property-label"><g:message code="institucion.nombre.label" default="Nombre" /></span>
							<span class="property-value" aria-labelledby="nombre-label"><g:fieldValue bean="${institucionInstance}" field="nombre"/></span>
						</li>
					</g:if></br>
					<g:if test="${institucionInstance?.tipoInstitucion}">
						<li class="fieldcontain">
							<span id="tipoInstitucion-label" class="property-label"><g:message code="institucion.tipoInstitucion.label" default="Tipo Institucion" /></span>
							<span class="property-value" aria-labelledby="tipoInstitucion-label"><g:link controller="tipoInstitucion" action="show" id="${institucionInstance?.tipoInstitucion?.id}">${institucionInstance?.tipoInstitucion?.encodeAsHTML()}</g:link></span>
						</li>
					</g:if></br>
					<g:if test="${institucionInstance?.vigente}">
						<li class="fieldcontain">
							<span id="vigente-label" class="property-label"><g:message code="institucion.vigente.label" default="Vigente" /></span>
							<span class="property-value" aria-labelledby="vigente-label"><g:formatBoolean boolean="${institucionInstance?.vigente}" /></span>
						</li>
					</g:if>
				</ol></br>
					<g:form url="[resource:institucionInstance, action:'delete']" method="DELETE">
						<fieldset class="buttons">
							<g:link class="edit btn btn-primary colortitle colorblack" action="edit" resource="${institucionInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
								&nbsp;
							<g:actionSubmit class="delete btn btn-primary colortitle colorblack" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
								&nbsp;
							<g:link class="list btn btn-primary colortitle colorblack" action="index">Regresar</g:link></li>
						</fieldset></br>
					</g:form>
			</div>
		</fieldset>
	</body>
</html>
