
<%@ page import="mx.amib.sistemas.catalogos.persona.model.catalog.NivelEstudios" %>
<!DOCTYPE html>
<html>
	<head>
	
	<!--  -->
		<link rel="stylesheet" type="text/css"
			href="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/css/jquery.dataTables.css">
		<script type="text/javascript" charset="utf8"
			src="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/jquery.dataTables.min.js"></script>

			<g:javascript src="figura.js" />
		<!--  -->
	
	
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nivelEstudios.label', default: 'Gestión Nivel Estudios')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
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
						<ul class="nav navbar-nav" role="navigation">
							<!-- <a href="#list-nivelEstudios" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
							<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li> -->
							<li><g:link class="create btn btn-primary colortitle colorblack" action="create">Crear nuevo nivel de estudios</g:link></li>
						</ul></br>
			</div>
		</fieldset>
		
		
		<fieldset>
			<div class="panel-heading">	
    			<div class="widgetTitle">
					<div id="list-nivelEstudios" class="content scaffold-list" role="main">
						<h1>Gestion nivel de estudios</h1>
						<g:if test="${flash.message}">
							<div class="message" role="status">${flash.message}</div>
						</g:if>
						
					</div>
				</div>
			</div>
		</fieldset>
		
		<fieldset>
			<div class="panel panel-default">
            	<div class="panel-heading">
                	<h3 class="panel-title">Lista de nivel de estudios</h3>
				</div>
			<table style="width: 100%; margin: auto;" border="0"
			id="tblFigura">
			<thead>
					<tr>
					
						<g:sortableColumn property="descripcion" title="${message(code: 'nivelEstudios.descripcion.label', default: 'Descripcion')}" />
					
						<g:sortableColumn property="vigente" title="${message(code: 'nivelEstudios.vigente.label', default: 'Vigente')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${nivelEstudiosInstanceList}" status="i" var="nivelEstudiosInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${nivelEstudiosInstance.id}">${fieldValue(bean: nivelEstudiosInstance, field: "descripcion")}</g:link></td>
					
						<td><g:formatBoolean boolean="${nivelEstudiosInstance.vigente}" /></td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${nivelEstudiosInstanceCount ?: 0}" />
			</div>
		</div>
	</fieldset>
	</body>
</html>
