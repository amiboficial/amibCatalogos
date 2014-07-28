<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="es" class="no-js"><!--<![endif]-->
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<title><g:layoutTitle default="Grails"/></title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="shortcut icon" href="${assetPath(src: 'favicon.ico')}" type="image/x-icon">
		<link rel="apple-touch-icon" href="${assetPath(src: 'apple-touch-icon.png')}">
		<link rel="apple-touch-icon" sizes="114x114" href="${assetPath(src: 'apple-touch-icon-retina.png')}">
  		<asset:stylesheet src="application.css"/>
		<asset:javascript src="application.js"/>
		<g:layoutHead/>	
	</head>
	<body>
	
	
		<div class="fluid-container body-content">
			<div class="body-content">
		<div class="container-fluid navbar-fixed-top">
		<header>
		
       	 	<div class="container-fluid colorcabecera">
          			<div class="row">
            			<div class="col-lg-2 col-sm-2 col-md-2 colorcabecera centrar">
            					<a href="${createLink(uri: '/')}" class="thumbnail colorcabecera">
            					<asset:image src="logoamib.jpeg" alt="AMIB"/>
                    			</a>
                		</div>
                		<div class="hidden-xs col-lg-6 col-sm-6 col-md-6 colorcabecera centrar">    
                			<h1 class="container colorletracabecera"> Asociacón Mexicana de Intermediarios Bursátiles </h1>
                		</div>
                	</div>
                </div>	
             </header>         
	
	<div class="container-fluid" role="navigation">
		<div class="row">
			<nav  class="navbar navbar-default">
        		<div class="navbar-header">       	
     					<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                				<span class="sr-only">Toggle navigation</span>
                    			<span class="icon-bar"></span>
                    			<span class="icon-bar"></span>
                    			<span class="icon-bar"></span>
            				</button>
            				<a href="#" class="navbar-brand">Catálogos Ver. 0.1</a>
						</div>
				<div class="navbar-collapse collapse">
					<div class="nav" role="navigation">
						<ul class="nav navbar-nav" role="navigation">
							<li><a href="#">link</a></li>
							<li><a href="#">link1</a></li>
						</ul>
						</div>
						</div>			
				</nav>
			</div>
		</div>
	</div>
</div>
			
			
			<div class="row">
				<div class="col-md-2 col-sm-3 col-lg-2">
				    <g:render template="/layouts/menusidebar" />
			   	</div>
			 
		    
			    <div class=" col-lg-10 col-md-10 col-md-offset2 col-sm-9 col-sm-offset2">
		    
		    		
						
			        <g:layoutBody/>
				</div>
			</div>

			<g:render template="/layouts/footer" />
		</div>
	</body>
</html>

