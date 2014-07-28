
<%@ page import="mx.amib.sistemas.catalogos.general.model.catalog.TipoInstitucion" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'tipoInstitucion.label', default: 'Tipo Institucion')}" />
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
							<!--  <a href="#create-tipoInstitucion" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
							<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>-->
							<li><g:link class="list btn btn-primary colortitle colorblack" action="index">Gestion tipo institucion</g:link></li>
						 </ul></br>
			</div>
		</fieldset>
		<fieldset>
   			<div class="panel panel-default col-lg-12">
            	<div class="panel-heading">	
                	<div class="widgetTitle">
						<div id="show-tipoInstitucion" class="content scaffold-show" role="main">
							<h1>Mostrar tipo institucion</h1>
							<g:if test="${flash.message}">
							<div class="message" role="status">${flash.message}</div>
							</g:if>
						</div>
					</div>
				</div></br>
	  			
						<ul class="property-list tipoInstitucion">
							
								<g:if test="${tipoInstitucionInstance?.descripcion}">
								<li class="fieldcontain">
									<span id="descripcion-label" class="property-label"><g:message code="tipoInstitucion.descripcion.label" default="Descripcion" /></span>
									
										<span class="property-value" aria-labelledby="descripcion-label"><g:fieldValue bean="${tipoInstitucionInstance}" field="descripcion"/></span>
									
								</li>
								</g:if>
							
								<g:if test="${tipoInstitucionInstance?.vigente}">
								<li class="fieldcontain">
									<span id="vigente-label" class="property-label"><g:message code="tipoInstitucion.vigente.label" default="Vigente" /></span>
									
										<span class="property-value" aria-labelledby="vigente-label"><g:formatBoolean boolean="${tipoInstitucionInstance?.vigente}" /></span>
									
								</li>
								</g:if>
							
							</ul>
							<g:form url="[resource:tipoInstitucionInstance, action:'delete']" method="DELETE">
								<fieldset class="buttons">
									<g:link class="edit btn btn-primary colortitle colorblack" action="edit" resource="${tipoInstitucionInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
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
