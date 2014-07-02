<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta name="layout" />
<title>Home controller</title>
<asset:stylesheet src="application.css"/>
<asset:javascript src="application.js"/>
</head>
<body>

<div class="fluid-container body-content">
    <div class="row">
        <div class="col-md-2">
            <br />
            <div style="text-align: center;">
                <!-- <img src="web-app/images/amib_logo.png" /><br/>  -->
                <asset:image src="amib_logo.png" alt="AMIB"/>
                <h3>Catálogos</h3>
                <h5>Ver. 0.1</h5>
            </div>
            <br/>

            <ul class="list-group">
                <!-- <li class="list-group-item active" style="background-color: azure; color: black; border-color: azure">Credencialización</li>  -->
                <li class="list-group-item active">Catálogos</li>
                <li class="list-group-item"><a href="#"><span class="glyphicon glyphicon-book"></span>&nbsp;AMIB General</a></li>
                <li class="list-group-item"><a href="#"><span class="glyphicon glyphicon-book"></span>&nbsp;Personal</a></li>
                <li class="list-group-item"><a href="#"><span class="glyphicon glyphicon-book"></span>&nbsp;Sepomex</a></li>
                <li class="list-group-item active">Acciones</li>
                <li class="list-group-item"><a href="#"><span class="glyphicon glyphicon-calendar"></span>&nbsp;Gestión de versiones</a></li>
                <li class="list-group-item"><a href="#"><span class="glyphicon glyphicon-search"></span>&nbsp;Búsqueda de registros</a></li>
            </ul>
            
        </div>
        <div class="col-md-10 col-md-offset2">

            <ul class="breadcrumb">
                <li><a href="#">Catálogos</a><span class="divider"></span></li>
                <li><a href="#">AMIB General</a></li>
            </ul>

            <h1><strong>Detalle de "AMIB General"</strong></h1>

            <fieldset>
                <legend>Descripción</legend>
                <form class="form-horizontal" role="form">
                    <div class="form-group">
                        <label for="" class="col-lg-2 control-label">Estatus de la cola:</label>
                        <div class="col-lg-10">
                            <p class="form-control-static">ACTIVA</p>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="" class="col-lg-2 control-label">Acciones a ejecutar:</label>
                        <div class="col-lg-10">
                            <button type="button" class="btn btn-default">Iniciar</button>
                            <button type="button" class="btn btn-default">Pausa</button>
                            <button type="button" class="btn btn-default">Detener</button>
                        </div>
                    </div>
                </form>
            </fieldset>

            <fieldset>
                <legend>Trabajos en cola</legend>

                <table class="table">
                    <thead>
                        <tr>
                            <th>#</th>
                            <th>Trabajo</th>
                            <th>Envíado por</th>
                            <th>Fecha y Hora</th>
                            <th>Status</th>
                            <th>Acciones</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>1</td>
                            <td>(Credencial) Alberto Ruíz Torres</td>
                            <td>agutierrez</td>
                            <td>@DateTime.Now.ToString()</td>
                            <td>En espera</td>
                            <td>Botones de acción</td>
                        </tr>
                        <tr>
                            <td>2</td>
                            <td>(Credencial) Renata Yañez Paredes</td>
                            <td>agutierrez</td>
                            <td>@DateTime.Now.ToString()</td>
                            <td>En espera</td>
                            <td>Botones de acción</td>
                        </tr>
                        <tr>
                            <td>3</td>
                            <td>(Credencial) Lucero Cadena Meza</td>
                            <td>agutierrez</td>
                            <td>@DateTime.Now.ToString()</td>
                            <td>En espera</td>
                            <td>Botones de acción</td>
                        </tr>
                        <tr>
                            <td>4</td>
                            <td>(Credencial) Juan Huerta Caminante</td>
                            <td>agutierrez</td>
                            <td>@DateTime.Now.ToString()</td>
                            <td>En espera</td>
                            <td>Botones de acción</td>
                        </tr>
                        <tr>
                            <td>5</td>
                            <td>(Credencial) Daniel Mendizaval Azteca</td>
                            <td>agutierrez</td>
                            <td>@DateTime.Now.ToString()</td>
                            <td>En espera</td>
                            <td>Botones de acción</td>
                        </tr>
                    </tbody>
                </table>

            </fieldset>
</div>
    </div>

    <hr />

    <footer>
        <p>&copy; 2014 - AMIB</p>
    </footer>
</div>

</body>
</html>