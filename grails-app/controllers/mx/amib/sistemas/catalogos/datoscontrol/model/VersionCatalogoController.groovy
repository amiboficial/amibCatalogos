package mx.amib.sistemas.catalogos.datoscontrol.model

import static org.springframework.http.HttpStatus.*
import grails.rest.RestfulController
import grails.transaction.Transactional

@Transactional(readOnly = true)
class VersionCatalogoController extends RestfulController {

    /*static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]*/
	static responseFormats = ['json', 'xml']
	
    /*def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond VersionCatalogo.list(params), model:[versionCatalogoInstanceCount: VersionCatalogo.count()]
    }*/

	VersionCatalogoController() {
		super(VersionCatalogo)
	}
	
	def obtenerUltimaVersion(){
		Integer numCat = params.int('numCat')
		respond VersionCatalogo.findAllByNumeroCatalogo(numCat)
	}
}
