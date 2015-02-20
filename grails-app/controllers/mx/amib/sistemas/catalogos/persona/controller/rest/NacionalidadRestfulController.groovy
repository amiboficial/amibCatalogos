package mx.amib.sistemas.catalogos.persona.controller.rest

import static org.springframework.http.HttpStatus.*
import mx.amib.sistemas.catalogos.persona.model.catalog.Nacionalidad
import grails.rest.RestfulController
import grails.transaction.Transactional
import grails.converters.JSON

@Transactional(readOnly = false)
class NacionalidadRestfulController extends RestfulController{

	static responseFormats = ['json', 'xml']
	
	NacionalidadRestfulController() {
		super(Nacionalidad)
	}
	
	def totalCount(){
		TreeMap<String,Long> responseMap = new TreeMap<String,Long>()
		responseMap.put("totalCount",Nacionalidad.count)
		respond responseMap
	}
	
	def list(){
		respond Nacionalidad.list()
	}
	
	def findAllByNumeroVersion(Long id){
		Long numeroVersion = id
		respond Nacionalidad.findAllByNumeroVersion(numeroVersion)
	}
	
	def getExistingIds(){
		def idsToCompareJSON = params.'ids'

		List<Long> idsToCompare = new ArrayList<Long>()
		JSON.parse(idsToCompareJSON).each{
			idsToCompare.add(Long.valueOf(it))
		}

		def result = Nacionalidad.executeQuery("select na.id from Nacionalidad na where na.id in :ids",[ids:idsToCompare])
		respond result
	}
}
