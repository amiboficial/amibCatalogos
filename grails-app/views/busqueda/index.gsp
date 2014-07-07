<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta name="layout" content="main"/>
<title>Catálogos 0.1 - Búsqueda de registros</title>
</head>
<body>

	<ul class="breadcrumb">
           <li><a href="#">Acciones</a><span class="divider"></span></li>
           <li><a href="#">Búsqueda de Registros</a></li>
	</ul>

	<h1><strong>Búsqueda de Registros</strong></h1>

	<form class="form-horizontal" role="form">
	
		<fieldset>
			<legend>Palabra de búsqueda</legend>
			
			<div class="alert alert-info alert-dismissable">
				<button type="button" class="close" data-dismiss="alert">&times;</button>
				Introduce la palabra o fragmento inicial de palabra a buscar en los catálogos.
			</div>
			
			<div class="form-group">
	            <label for="txtPalabraClave" class="col-lg-2 control-label">Palabra clave</label>
	            <div class="col-lg-10">
	            	<input type="text" class="form-control" id="txtPalabraClave" placeholder="Palabra clave">
	            </div>
	        </div>
	        <div class="form-group">
				<div class="col-lg-offset-2 col-lg-10">
					<button type="button" class="btn btn-default">Buscar</button>
				</div>
			</div>
	        
		</fieldset>
	
	    <fieldset>
	        <legend>Parámetros de la búsqueda</legend>
	        
	        <div class="alert alert-info alert-dismissable">
				<button type="button" class="close" data-dismiss="alert">&times;</button>
				Si requiere una búsqueda mas especifica, selecciona de la siguiente lista de siguiente
			</div>
	        
	    </fieldset>

	</form>
</body>
</html>


