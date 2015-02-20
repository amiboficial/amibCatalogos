package mx.amib.sistemas.catalogos.persona.controller.rest

import static org.springframework.http.HttpStatus.*
import mx.amib.sistemas.catalogos.persona.model.catalog.TipoTelefono
import grails.rest.RestfulController
import grails.transaction.Transactional
import grails.converters.JSON

@Transactional(readOnly = false)
class TipoTelefonoRestfulController  extends RestfulController{

	static responseFormats = ['json', 'xml']
	
    TipoTelefonoRestfulController(){
		super(TipoTelefono)
	}
	
	def totalCount(){
		TreeMap<String,Long> responseMap = new TreeMap<String,Long>()
		responseMap.put("totalCount",TipoTelefono.count)
		respond responseMap
	}
	
	def list(){
		respond TipoTelefono.list()
	}
	
	def findAllByNumeroVersion(Long id){
		Long numeroVersion = id
		respond TipoTelefono.findAllByNumeroVersion(numeroVersion)
	}
	
	def getExistingIds(){
		def idsToCompareJSON = params.'ids'

		List<Long> idsToCompare = new ArrayList<Long>()
		JSON.parse(idsToCompareJSON).each{
			idsToCompare.add(Long.valueOf(it))
		}

		def result = TipoTelefono.executeQuery("select tt.id from TipoTelefono tt where tt.id in :ids",[ids:idsToCompare])
		respond result
	}
}
