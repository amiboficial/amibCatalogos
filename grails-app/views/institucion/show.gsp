
<%@ page import="mx.amib.sistemas.catalogos.general.model.catalog.Institucion" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="vavBar">
		<g:set var="entityName" value="${message(code: 'institucion.label', default: 'Institucion')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
	
	<div class="container" role="navigation">
	<div class="row">
		<nav  class="navbar navbar-default">
        		<div class="navbar-header">       	
     					<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                				<span class="sr-only">Toggle navigation</span>
                    			<span class="icon-bar"></span>
                    			<span class="icon-bar"></span>
            				</button>
						</div>
				<div class="navbar-collapse collapse">
					<div class="nav" role="navigation">
						 <ul class="nav navbar-nav navbar-center">
							<!-- <a href="#create-institucion" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a> -->
						    <!--<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li> -->
							<li><g:link class="list" action="index">Gestion institución</g:link></li>
						</ul>
					</div>
				</div>
			</nav>
		</div>
	</div>
		
		
		
<div class="container">
	<div class="row">
   		<div class="panel panel-default">
            	<div class="panel-heading">	
                	<div class="widgetTitle">
						<div id="show-institucion" class="content scaffold-show" role="vavBar">
							<h1>Mostrar institución</h1>
							<g:if test="${flash.message}">
							<div class="message" role="status">${flash.message}</div>
							</g:if>
							</div></br>
							<ol class="property-list institucion">	
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
								<g:link class="edit" action="edit" resource="${institucionInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
								<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
							</fieldset></br>
							<fieldset class="buttons">
									<g:link class="list" action="index">Regresar</g:link></li>
							</fieldset>
					</g:form>
				</div>
			</div>
		</div>
	</div>
</div>
	</body>
</html>
