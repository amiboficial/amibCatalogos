package mx.amib.sistemas.catalogos.sepomex.controller.rest

import static org.springframework.http.HttpStatus.*
import mx.amib.sistemas.catalogos.sepomex.model.catalog.EntidadFederativa
import grails.rest.RestfulController
import grails.transaction.Transactional

@Transactional(readOnly = false)
class EntidadFederativaRestfulController extends RestfulController {

	static responseFormats = ['json', 'xml']
	
	EntidadFederativaRestfulController(){
		super(EntidadFederativa)
	}
	
}
