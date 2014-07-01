package mx.amib.sistemas.catalogos.general.controller.rest

import static org.springframework.http.HttpStatus.*
import mx.amib.sistemas.catalogos.general.model.catalog.Institucion
import grails.rest.RestfulController
import grails.transaction.Transactional

@Transactional(readOnly = false)
class InstitucionRestfulController extends RestfulController{

	static responseFormats = ['json', 'xml']
	
	InstitucionRestfulController() {
		super(Institucion)
	}
	
}
