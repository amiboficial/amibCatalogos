
<%@ page import="mx.amib.sistemas.catalogos.general.model.catalog.Figura" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
	
	<!--  -->
		<link rel="stylesheet" type="text/css"
			href="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/css/jquery.dataTables.css">
		<script type="text/javascript" charset="utf8"
			src="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/jquery.dataTables.min.js"></script>

			<g:javascript src="figura.js" />
		<!--  -->




	</head>
	<body>
		<ul class="breadcrumb">
           <li><a href="#">Inicio</a><span class="divider"></span></li>
           <li><a href="#">Gestión figura</a></li>
           <li><a href="#">Mostrar Figura</a></li>
           
		</ul>
	 	<fieldset>
			<div class="panel panel-default col-lg-12">
           		<div class="panel-heading">
					<h2 class="panel-title">Acciones</h2>
					</div></br>
						 <ul class="nav navbar-nav navbar-center">
							<!--<li class"active"><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li> --> 
							<li><g:link class="list btn btn-primary colortitle colorblack" action="index">Gestion figura</g:link></li>
						</ul></br>
			</div>
		</fieldset>
			    	
		<fieldset>
   			<div class="panel panel-default col-lg-12">
            	<div class="panel-heading">	
                	<div class="widgetTitle">
						<div id="show-figura" class="content scaffold-show" role="main">
							<h1>Mostrar figura</h1>
							<g:if test="${flash.message}">
							<div class="message" role="status">${flash.message}</div>
							</g:if>                	
						</div>
					</div>
				</div></br>
		
			<ul class="property-list figura">
				<g:if test="${figuraInstance?.descripcion}">
					<li class="fieldcontain">
						<span id="descripcion-label" class="property-label"><g:message code="figura.descripcion.label" default="Descripcion" /></span>
					
						<span class="property-value" aria-labelledby="descripcion-label"><g:fieldValue bean="${figuraInstance}" field="descripcion"/></span>
					
					</li>
				</g:if></br>
				
				<g:if test="${figuraInstance?.vigente}">
					<li class="fieldcontain">
						<span id="vigente-label" class="property-label"><g:message code="figura.vigente.label" default="Vigente" /></span>
					
						<span class="property-value" aria-labelledby="vigente-label"><g:formatBoolean boolean="${figuraInstance?.vigente}" /></span>
					
					</li>
				</g:if></br>
			</ul>
			
			<!--  <legend>
					<strong>Información de la figura</strong>
				</legend></br>
				<table style="width: 100%">
					<tr>
						<td class="label colorblack" style="text-align: right; width: 40%;"><g:message
								code="figura.descripcion.label" default="Descripcion" />:</td>
						<td><span class="property-value"
							aria-labelledby="descripcion-label">
							<g:fieldValue
									bean="${figuraInstance}" field="descripcion" /></span></td>
					</tr>
					<tr>
						<td class="label colorblack" style="text-align: right; width: 40%;"><span
							id="vigente-label" class="property-label"><g:message
									code="figura.vigente.label" default="Vigente" />:</span></td>
						<td><span class="property-value"
							aria-labelledby="vigente-label"><g:formatBoolean
									boolean="${figuraInstance?.vigente}" /></span></td>
					</tr>
					
				</table></br>
			-->
			<g:form url="[resource:figuraInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit btn btn-primary colortitle colorblack" action="edit" resource="${figuraInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
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
