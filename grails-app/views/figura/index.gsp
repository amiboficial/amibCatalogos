
<%@ page import="mx.amib.sistemas.catalogos.general.model.catalog.Figura" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
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
		<ul class="breadcrumb">
           <li><a href="#">Inicio</a><span class="divider"></span></li>
           <li><a href="#">Gestión figura</a></li>
		</ul>
		<fieldset>
			<div class="panel panel-default col-lg-12">
            	<div class="panel-heading">
					<h2 class="panel-title">Acciones</h2>
					</div></br>
					
						<ul class="nav navbar-nav" role="navigation">
							<!--  <li class="active"><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>-->
							<li><g:link class="create btn btn-primary colortitle colorblack" action="create">Crear nueva figura</g:link></li>
						</ul></br>
					</div>
		</fieldset>		
		<fieldset>
			<div class="panel-heading">	
    			<div class="widgetTitle">
					<div id="list-figura" class="content scaffold-list" role="main">
			   		 	<h1>Gestión Figura</h1>
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
                	<h3 class="panel-title">Lista de figuras</h3>
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
		</fieldset>
		 	<div class="pagination">
				<g:paginate total="${figuraInstanceCount ?: 0}" />
			</div>
	</body>
</html>
