package mx.amib.sistemas.catalogos.sepomex.controller.rest

import static org.springframework.http.HttpStatus.*
import mx.amib.sistemas.catalogos.sepomex.model.catalog.Ciudad
import grails.rest.RestfulController
import grails.transaction.Transactional

@Transactional(readOnly = false)
class CiudadRestfulController extends RestfulController {

	static responseFormats = ['json', 'xml']
	
	CiudadRestfulController() {
		super(Ciudad)
	}
	
}
