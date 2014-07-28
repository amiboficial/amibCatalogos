<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'institucion.label', default: 'Institucion')}" />
		<title><g:message code="default.create.label" args="[entityName]" /></title>
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
							<!-- <a href="#create-institucion" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>-->
				        	<!-- <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li> -->
							<li><g:link class="list btn btn-primary colortitle colorblack" action="index">Gestion institución</g:link></li>
						</ul></br>
			</div>
		</fieldset>
				    
	<fieldset>
			<div class="panel panel-default col-lg-12">
            	<div class="panel-heading">	
    				<div class="widgetTitle">
						<div id="create-institucion" class="content scaffold-create" role="main">
							<h1><g:message code="default.create.label" args="[entityName]" /></h1></br>
							<g:if test="${flash.message}">
							<div class="message" role="status">${flash.message}</div>
						</g:if>
						</div>
					</div>
				</div></br>
				
			<g:hasErrors bean="${institucionInstance}">
				<ul class="errors" role="alert">
					<g:eachError bean="${institucionInstance}" var="error">
						<li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
					</g:eachError>
				</ul>
			</g:hasErrors>
				<g:form url="[resource:institucionInstance, action:'save']" >
					<fieldset class="form">
						<g:render template="form"/>
					</fieldset></br>
					<fieldset class="buttons">
						<g:submitButton name="create" class="save btn btn-primary colortitle colorblack" value="${message(code: 'default.button.create.label', default: 'Create')}" />
							&nbsp;
						<g:link class="list btn btn-primary colortitle colorblack" action="index">Regresar</g:link></li>
					</fieldset></br>
				</g:form>
			</div>
	</fieldset>


	</body>
</html>
