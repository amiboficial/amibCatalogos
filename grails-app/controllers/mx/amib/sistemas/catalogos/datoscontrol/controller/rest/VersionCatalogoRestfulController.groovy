package mx.amib.sistemas.catalogos.datoscontrol.controller.rest

import static org.springframework.http.HttpStatus.*
import mx.amib.sistemas.catalogos.datoscontrol.model.VersionCatalogo
import grails.rest.RestfulController
import grails.transaction.Transactional

@Transactional(readOnly = false)
class VersionCatalogoRestfulController extends RestfulController {

	static responseFormats = ['json', 'xml']
	
    /*def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond VersionCatalogo.list(params), model:[versionCatalogoInstanceCount: VersionCatalogo.count()]
    }*/

	VersionCatalogoRestfulController() {
		super(VersionCatalogo)
	}
	
	def obtenerUltimaVersion(Integer id){
		Integer numCat = id
		respond VersionCatalogo.findByNumeroCatalogo(numCat)
	}
}
