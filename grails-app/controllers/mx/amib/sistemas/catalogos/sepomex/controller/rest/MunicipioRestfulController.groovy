package mx.amib.sistemas.catalogos.sepomex.controller.rest

import static org.springframework.http.HttpStatus.*
import mx.amib.sistemas.catalogos.sepomex.model.catalog.Municipio
import grails.rest.RestfulController
import grails.transaction.Transactional

@Transactional(readOnly = false)
class MunicipioRestfulController extends RestfulController {

	static responseFormats = ['json', 'xml']
	
	MunicipioRestfulController(){
		super(Municipio)
	}
	
}
