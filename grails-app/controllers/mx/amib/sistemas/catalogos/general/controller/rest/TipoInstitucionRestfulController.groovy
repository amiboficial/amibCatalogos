package mx.amib.sistemas.catalogos.general.controller.rest

import static org.springframework.http.HttpStatus.*
import mx.amib.sistemas.catalogos.general.model.catalog.TipoInstitucion
import grails.rest.RestfulController
import grails.transaction.Transactional

@Transactional(readOnly = false)
class TipoInstitucionRestfulController extends RestfulController{

	static responseFormats = ['json', 'xml']
	
	TipoInstitucionRestfulController() {
		super(TipoInstitucion)
	}
	
}
