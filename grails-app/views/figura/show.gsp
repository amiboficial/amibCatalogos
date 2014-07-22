
<%@ page import="mx.amib.sistemas.catalogos.general.model.catalog.Figura" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="vavBar">
	
	<!--  -->
		<link rel="stylesheet" type="text/css"
			href="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/css/jquery.dataTables.css">
		<script type="text/javascript" charset="utf8"
			src="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/jquery.dataTables.min.js"></script>

			<g:javascript src="figura.js" />
		<!--  -->




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
							<!--<li class"active"><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li> --> 
							<li><g:link class="list" action="index">Gestion figura</g:link></li>
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
						<div id="show-figura" class="content scaffold-show" role="vavBar">
						<h1>Mostrar figura</h1>
						<g:if test="${flash.message}">
						<div class="message" role="status">${flash.message}</div>
						</g:if>                	
				</div>
			
			<ol class="property-list figura">
			
				<g:if test="${figuraInstance?.descripcion}">
				<li class="fieldcontain">
					<span id="descripcion-label" class="property-label"><g:message code="figura.descripcion.label" default="Descripcion" /></span>
					
						<span class="property-value" aria-labelledby="descripcion-label"><g:fieldValue bean="${figuraInstance}" field="descripcion"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${figuraInstance?.vigente}">
				<li class="fieldcontain">
					<span id="vigente-label" class="property-label"><g:message code="figura.vigente.label" default="Vigente" /></span>
					
						<span class="property-value" aria-labelledby="vigente-label"><g:formatBoolean boolean="${figuraInstance?.vigente}" /></span>
					
				</li>
				</g:if>
			
			</ol>
			
			<g:form url="[resource:figuraInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${figuraInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
					
			
				<legend>
					<strong>Información de la figura</strong>
				</legend>
				<table style="width: 100%">
					<tr>
						<td class="label" style="text-align: right; width: 40%;"><g:message
								code="figura.descripcion.label" default="Descripcion" />:</td>
						<td><span class="property-value"
							aria-labelledby="descripcion-label">
							<g:fieldValue
									bean="${figuraInstance}" field="descripcion" /></span></td>
					</tr>
					<tr>
						<td class="label" style="text-align: right; width: 40%;"><span
							id="vigente-label" class="property-label"><g:message
									code="figura.vigente.label" default="Vigente" />:</span></td>
						<td><span class="property-value"
							aria-labelledby="vigente-label"><g:formatBoolean
									boolean="${figuraInstance?.vigente}" /></span></td>
					</tr>
					
				</table>
				
				
				
				</fieldset>
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
