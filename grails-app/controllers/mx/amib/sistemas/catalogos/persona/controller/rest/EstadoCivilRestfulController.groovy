package mx.amib.sistemas.catalogos.persona.controller.rest

import static org.springframework.http.HttpStatus.*
import mx.amib.sistemas.catalogos.persona.model.catalog.EstadoCivil
import grails.rest.RestfulController
import grails.transaction.Transactional
import grails.converters.JSON

@Transactional(readOnly = false)
class EstadoCivilRestfulController extends RestfulController{

	static responseFormats = ['json', 'xml']
	
    EstadoCivilRestfulController(){ 
		super(EstadoCivil)
	}
	
	def totalCount(){
		TreeMap<String,Long> responseMap = new TreeMap<String,Long>()
		responseMap.put("totalCount",EstadoCivil.count)
		respond responseMap
	}
	
	def list(){
		respond EstadoCivil.list()
	}
	
	def findAllByNumeroVersion(Long id){
		Long numeroVersion = id
		respond EstadoCivil.findAllByNumeroVersion(numeroVersion)
	}
	
	def getExistingIds(){
		def idsToCompareJSON = params.'ids'

		List<Long> idsToCompare = new ArrayList<Long>()
		JSON.parse(idsToCompareJSON).each{
			idsToCompare.add(Long.valueOf(it))
		}

		def result = EstadoCivil.executeQuery("select e.id from EstadoCivil e where e.id in :ids",[ids:idsToCompare])
		respond result
	}
}
