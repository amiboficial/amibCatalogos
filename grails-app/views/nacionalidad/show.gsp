
<%@ page import="mx.amib.sistemas.catalogos.persona.model.catalog.Nacionalidad" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nacionalidad.label', default: 'Nacionalidad')}" />
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
							<!-- <a href="#create-nacionalidad" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
							<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li> -->
							<li><g:link class="list btn btn-primary colortitle colorblack" action="index">Geston nacionalidad</g:link></li>
						</ul></br>
			</div>
		</fieldset>
		
		
		
		
		<fieldset>
   			<div class="panel panel-default col-lg-12">
            	<div class="panel-heading">	
                	<div class="widgetTitle">
						<div id="show-nacionalidad" class="content scaffold-show" role="main">
							<h1>Mostrar Nacionalidad</h1>
							<g:if test="${flash.message}">
								<div class="message" role="status">${flash.message}</div>
							</g:if>
						</div>
					</div>
				</div>
				
			<ul class="property-list nacionalidad">
			
				<g:if test="${nacionalidadInstance?.descripcion}"></br>
				<li class="fieldcontain">
					<span id="descripcion-label" class="property-label"><g:message code="nacionalidad.descripcion.label" default="Descripcion" /></span>
					
						<span class="property-value" aria-labelledby="descripcion-label"><g:fieldValue bean="${nacionalidadInstance}" field="descripcion"/></span>
					
				</li>
				</g:if></br>
			
				<g:if test="${nacionalidadInstance?.vigente}">
				<li class="fieldcontain">
					<span id="vigente-label" class="property-label"><g:message code="nacionalidad.vigente.label" default="Vigente" /></span>
					
						<span class="property-value" aria-labelledby="vigente-label"><g:formatBoolean boolean="${nacionalidadInstance?.vigente}" /></span>
					
				</li>
				</g:if></br>
			
			</ul>
			<g:form url="[resource:nacionalidadInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit btn btn-primary colortitle colorblack" action="edit" resource="${nacionalidadInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					&nbsp;
					<g:actionSubmit class="delete btn btn-primary colortitle colorblack" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
					&nbsp;
					<g:link class="list btn btn-primary colortitle colorblack" action="index">Regresar</g:link>
				</fieldset></br>
			</g:form>
		</div>
	</body>
</html>
