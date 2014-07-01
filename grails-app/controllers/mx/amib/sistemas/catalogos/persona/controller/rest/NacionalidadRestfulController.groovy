package mx.amib.sistemas.catalogos.persona.controller.rest

import static org.springframework.http.HttpStatus.*
import mx.amib.sistemas.catalogos.persona.model.catalog.Nacionalidad
import grails.rest.RestfulController
import grails.transaction.Transactional

@Transactional(readOnly = false)
class NacionalidadRestfulController extends RestfulController{

	static responseFormats = ['json', 'xml']
	
	NacionalidadRestfulController() {
		super(Nacionalidad)
	}
	
}
