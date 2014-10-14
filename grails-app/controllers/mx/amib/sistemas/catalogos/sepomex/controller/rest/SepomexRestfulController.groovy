package mx.amib.sistemas.catalogos.sepomex.controller.rest

import static org.springframework.http.HttpStatus.*
import mx.amib.sistemas.catalogos.sepomex.model.catalog.Sepomex
import grails.converters.JSON
import grails.rest.RestfulController
import grails.transaction.Transactional

@Transactional(readOnly = false)
class SepomexRestfulController extends RestfulController {

	static responseFormats = ['json', 'xml']
	
	SepomexRestfulController() {
		super(Sepomex)
	}
	
	def findByCodigoPostal(){
		String codigoPostal = params.'cp'
		
		render Sepomex.findAllByCodigoPostalAndVigente(codigoPostal,true) as JSON
	}
	
}
