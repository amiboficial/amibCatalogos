import groovyx.net.http.ParserRegistry

class BootStrap {

    def init = { servletContext ->
		// Get spring
		def springContext = org.springframework.web.context.support.WebApplicationContextUtils.getWebApplicationContext( servletContext );
		
		springContext.getBean( "customObjectMarshallers" ).register();
		ParserRegistry.setDefaultCharset("UTF-8");
    }
    def destroy = {
    }
}
