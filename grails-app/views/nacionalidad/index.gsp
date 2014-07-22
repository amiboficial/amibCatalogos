
<%@ page import="mx.amib.sistemas.catalogos.persona.model.catalog.Nacionalidad" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		Gestion Nacionalidad
		
		<!--  -->
		<link rel="stylesheet" type="text/css"
			href="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/css/jquery.dataTables.css">
		<script type="text/javascript" charset="utf8"
			src="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/jquery.dataTables.min.js"></script>

			<g:javascript src="figura.js" />
		<!--  -->
		
	</head>
	<body>
		<a href="#list-nacionalidad" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create">Crear nueva nacionalidad</g:link></li>
			</ul>
		</div>
		<div id="list-nacionalidad" class="content scaffold-list" role="main">
			<h1>Gestion Nacionalidad</h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table style="width: 100%; margin: auto;" border="0"
			id="tblFigura">
			<thead>
					<tr>
					
						<g:sortableColumn property="descripcion" title="${message(code: 'nacionalidad.descripcion.label', default: 'Descripcion')}" />
					
						<g:sortableColumn property="vigente" title="${message(code: 'nacionalidad.vigente.label', default: 'Vigente')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${nacionalidadInstanceList}" status="i" var="nacionalidadInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${nacionalidadInstance.id}">${fieldValue(bean: nacionalidadInstance, field: "descripcion")}</g:link></td>
					
						<td><g:formatBoolean boolean="${nacionalidadInstance.vigente}" /></td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${nacionalidadInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
