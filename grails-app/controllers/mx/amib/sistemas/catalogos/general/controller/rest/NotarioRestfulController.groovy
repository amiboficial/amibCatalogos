package mx.amib.sistemas.catalogos.general.controller.rest

import grails.converters.JSON
import grails.gorm.DetachedCriteria
import grails.rest.RestfulController
import grails.transaction.Transactional
import mx.amib.sistemas.catalogos.general.model.catalog.Notario

@Transactional(readOnly = false)
class NotarioRestfulController extends RestfulController{
	static responseFormats = ['json', 'xml']
	
	NotarioRestfulController(){
		super(Notario)
	}
	
	def index(){
		
		Integer max = Integer.parseInt(params.'max'?:'10')
		Integer offset = Integer.parseInt(params.'offset'?:'0')
		String sort = params.'sort'?:'id'
		String order = params.'order'?:'asc'
		
		SearchResult sr = new SearchResult()
		
		//Se checan los parametros de "control"
		if(max == null || max <= 0){
			max = 10;
		}
		if(offset == null || offset <= 0){
			offset = 0;
		}
		if(sort == null || sort == ""){
			sort = "id";
		}
		else if(!["idEntidadFederativa","numeroNotaria","nombreCompleto"].contains(sort)){
			sort = "id";
		}
		if(order == null || order == ""){
			order = "asc";
		}
		else if(order != "desc" && order != "asc"){
			order = "asc";
		}
		
		try{
			sr.list = Notario.list(max:max, offset: offset, sort: sort, order: order)
			sr.count = Notario.count()
			sr.error = false
		}
		catch(Exception e){
			sr.error = true
			sr.errorMessage = e.message
		}
		
		render sr as JSON
	}
	
	def findAllBy(){
			
		Integer max = Integer.parseInt(params.'max'?:'10')
		Integer offset = Integer.parseInt(params.'offset'?:'0')
		String sort = params.'sort'?:'id'
		String order = params.'order'?:'asc'
		
		Long idEntidadFederativa = Long.parseLong(params.'idEntidadFederativa'?:'-1')
		Integer numeroNotaria = Integer.parseInt(params.'numeroNotaria'?:'-1')
		String nombreCompleto = params.'nombreCompleto'?:''
		
		SearchResult sr = new SearchResult()
		
		//Se checan los parametros de "control"
		if(max == null || max <= 0){
			max = 10;
		}
		if(offset == null || offset <= 0){
			offset = 0;
		}
		if(sort == null || sort == ""){
			sort = "id";
		}
		else if( !['idEntidadFederativa','numeroNotaria','nombreCompleto'].contains(sort) ){
			sort = "id";
		}
		if(order == null || order == ""){
			order = "asc";
		}
		else if(order != "desc" && order != "asc"){
			order = "asc";
		}
		
		def whereCriteria = new DetachedCriteria(Notario).build {
			if(idEntidadFederativa != null && idEntidadFederativa > 0){
				eq("idEntidadFederativa",idEntidadFederativa)
			}
			if(numeroNotaria != null && numeroNotaria > 0){
				eq("numeroNotaria",numeroNotaria)
			}
			if(nombreCompleto != null && nombreCompleto.trim().compareTo("") != 0){
				like("nombreCompleto",nombreCompleto + "%")
			}
		}
		
		try{
			sr.list = whereCriteria.list(max:max, offset: offset, sort: sort, order: order)
			sr.count = whereCriteria.count()
			sr.error = false
		}
		catch(Exception e){
			sr.error = true
			sr.errorMessage = e.message
		}
		render sr as JSON
	}
	
}

class SearchResult{
	def list
	Long count
	Boolean error
	String errorMessage
}