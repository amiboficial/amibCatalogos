
<%@ page import="mx.amib.sistemas.catalogos.general.model.catalog.Institucion" %>
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
						<!--  <a href="#list-institucion" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a> -->
						<div class="nav" role="navigation">
							<ul class="nav navbar-nav navbar-center" role="navigation">
								<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
								<li><g:link class="create" action="create">Crear nueva institucion</g:link></li>
							</ul>
						</div>
				</div>
		</nav>
	</div>
</div>



<div class="container">
	<div class="row">
    	<div class="widgetTitle text-center">
			<div id="list-institucion" class="content scaffold-list" role="vavBar">
				<h1>Gestion institucion</h1>
				<g:if test="${flash.message}">
					<div class="message" role="status">${flash.message}</div>
				</g:if>
				<table style="width: 100%; margin: auto;" border="0" id="tblFigura">
			<thead>
					<tr>
					
						<g:sortableColumn property="nombre" title="${message(code: 'institucion.nombre.label', default: 'Nombre')}" />
					
						<th><g:message code="institucion.tipoInstitucion.label" default="Tipo Institucion" /></th>
					
						<g:sortableColumn property="vigente" title="${message(code: 'institucion.vigente.label', default: 'Vigente')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${institucionInstanceList}" status="i" var="institucionInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${institucionInstance.id}">${fieldValue(bean: institucionInstance, field: "nombre")}</g:link></td>
					
						<td>${fieldValue(bean: institucionInstance, field: "tipoInstitucion")}</td>
					
						<td><g:formatBoolean boolean="${institucionInstance.vigente}" /></td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${institucionInstanceCount ?: 0}" />
			</div>
		</div>
		</div>
		</div>
		</div>
	</body>
</html>
