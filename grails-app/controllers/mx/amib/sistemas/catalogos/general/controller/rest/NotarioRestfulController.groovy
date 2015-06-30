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
	
	def index(Integer max, Integer offset,
			String sort, String order){
		
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
		else if(!Arrays.asList( ["idEntidadFederativa","numeroNotario","nombreCompleto"] ).contains(sort)){
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
	
	def findAllBy(Long idEntidadFederativa, Integer numeroNotario, String nombreCompleto, 
			Integer max, Integer offset, String sort, String order){
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
		else if(!Arrays.asList( ["idEntidadFederativa","numeroNotario","nombreCompleto"] ).contains(sort)){
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
			if(numeroNotario != null && numeroNotario > 0){
				eq("numeroNotario",numeroNotario)
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