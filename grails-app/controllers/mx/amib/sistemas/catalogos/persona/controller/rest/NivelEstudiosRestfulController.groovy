package mx.amib.sistemas.catalogos.persona.controller.rest

import static org.springframework.http.HttpStatus.*
import mx.amib.sistemas.catalogos.persona.model.catalog.NivelEstudios
import grails.rest.RestfulController
import grails.transaction.Transactional

@Transactional(readOnly = false)
class NivelEstudiosRestfulController extends RestfulController{

	static responseFormats = ['json', 'xml']
	
	NivelEstudiosRestfulController() {
		super(NivelEstudios)
	}
	
	def totalCount(){
		TreeMap<String,Long> responseMap = new TreeMap<String,Long>()
		responseMap.put("totalCount",NivelEstudios.count)
		respond responseMap
	}
	
	def list(){
		respond NivelEstudios.list()
	}
	
	def findAllByVersion(Long id){
		Long numeroVersion = id
		respond Nacionalidad.findAllByVersion(numeroVersion)
	}
	
	def getExistingIds(){
		def idsToCompareJSON = params.'ids'

		List<Long> idsToCompare = new ArrayList<Long>()
		JSON.parse(idsToCompareJSON).each{
			idsToCompare.add(Long.valueOf(it))
		}

		def result = NivelEstudios.executeQuery("select ne.id from NivelEstudios ne where ne.id in :ids",[ids:idsToCompare])
		respond result
	}
}
