
<%@ page import="mx.amib.sistemas.catalogos.general.model.catalog.Figura" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="vavBar">
		<!-- Gestion figura -->
		  <link href="http://maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
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
						<ul class="nav navbar-nav navbar-center" role="navigation">
							<!--  <li class="active"><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>-->
							<li><g:link class="create" action="create">Crear nueva figura</g:link></li>
						</ul>
					</div>		
				</div>
			</nav>
			</div>
		</div>
			
			
	<div class="container">
		<div class="row">
    	<div class="widgetTitle text-center">
			<div id="list-figura" class="content scaffold-list" role="vavBar">
			    <h1>Gestión Figura</h1>
			      <g:if test="${flash.message}">
					<div class="message" role="status">${flash.message}</div>
				  </g:if>
			</div>
		</div>
			
		<div class="panel panel-default">
            	<div class="panel-heading">
                	<h3 class="panel-title">Tabla gestión figura</h3>
				</div>
			
			<table class="table table-bordered table-striped table-hover" style="width: 100%; margin: auto;" border="0"
			id="tblFigura">
			<thead>
					<tr>				
						<g:sortableColumn property="descripcion" title="${message(code: 'figura.descripcion.label', default: 'Descripcion')}" />
					
						<g:sortableColumn property="vigente" title="${message(code: 'figura.vigente.label', default: 'Vigente')}" />
					</tr>
				</thead>
				<tbody>
				<g:each in="${figuraInstanceList}" status="i" var="figuraInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${figuraInstance.id}">${fieldValue(bean: figuraInstance, field: "descripcion")}</g:link></td>
					
						<td><g:formatBoolean boolean="${figuraInstance.vigente}" /></td>
					</tr>
				</g:each>
				</tbody>
			</table>
		</div>
			 
		 	<div class="pagination">
				<g:paginate total="${figuraInstanceCount ?: 0}" />
			</div>
			
		</div>
		</div>
	</body>
</html>
