package mx.amib.sistemas.catalogos.general.controller.rest;

import static org.springframework.http.HttpStatus.*
import mx.amib.sistemas.catalogos.general.model.catalog.GrupoFinanciero
import grails.rest.RestfulController
import grails.transaction.Transactional

@Transactional(readOnly = false)
public class GrupoFinancieroRestfulController extends RestfulController{

	static responseFormats = ['json', 'xml']
			
	GrupoFinancieroRestfulController() {
		super(GrupoFinanciero)
	}
	
}
