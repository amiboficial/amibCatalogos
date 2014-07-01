package mx.amib.sistemas.catalogos.sepomex.controller.rest

import static org.springframework.http.HttpStatus.*
import mx.amib.sistemas.catalogos.sepomex.model.catalog.Asentamiento
import grails.rest.RestfulController
import grails.transaction.Transactional

@Transactional(readOnly = false)
class AsentamientoRestfulController extends RestfulController {

	static responseFormats = ['json', 'xml']
	
	AsentamientoRestfulController() {
		super(Asentamiento)
	}
	
}
