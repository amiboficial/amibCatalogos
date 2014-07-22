<%@ page import="mx.amib.sistemas.catalogos.general.model.catalog.Institucion" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="vavBar">
		<g:set var="entityName" value="${message(code: 'institucion.label', default: 'Institucion')}" />
		<title><g:message code="default.edit.label" args="[entityName]" /></title>
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
							<ul class="nav navbar-nav navbar-center" role="vavBar">
								<!-- <a href="#edit-institucion" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a> -->
								<!-- <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li> -->
								<li><g:link class="list" action="index">Gestion institucion</g:link></li>
								<li><g:link class="create" action="create">Crear institucion</g:link></li>
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
					<div id="edit-institucion" class="content scaffold-edit" role="vavBar">
						<h1><g:message code="default.edit.label" args="[entityName]" /></h1>
						<g:if test="${flash.message}">
						<div class="message" role="status">${flash.message}</div>
						</g:if>
						</div>
						<g:hasErrors bean="${institucionInstance}">
						<ul class="errors" role="alert">
							<g:eachError bean="${institucionInstance}" var="error">
								<li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
							</g:eachError>
						</ul>
						</g:hasErrors>
						<g:form url="[resource:institucionInstance, action:'update']" method="PUT" >
						<g:hiddenField name="version" value="${institucionInstance?.version}" />
						<fieldset class="form">
							<g:render template="form"/>
						</fieldset></br>
						<fieldset class="buttons">
							<g:actionSubmit class="save" action="update" value="${message(code: 'default.button.update.label', default: 'Update')}" />
						</fieldset></br>
						<fieldset class="buttons">
							<g:link class="list" action="index">Regresar</g:link></li>
						</fieldset></br></br>
						</g:form>
					</div>
				</div>
			</div>
		</div>
	</div>
	</body>
</html>
