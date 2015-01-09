package mx.amib.sistemas.catalogos.persona.controller.rest

import static org.springframework.http.HttpStatus.*
import mx.amib.sistemas.catalogos.persona.model.catalog.TipoDocumentoSustentante
import grails.rest.RestfulController
import grails.transaction.Transactional

@Transactional(readOnly = false)
class TipoDocumentoSustentanteRestfulController  extends RestfulController{

	static responseFormats = ['json', 'xml']
	
    TipoDocumentoSustentanteRestfulController() {
		super(TipoDocumentoSustentante)
	}
	
	def totalCount(){
		TreeMap<String,Long> responseMap = new TreeMap<String,Long>()
		responseMap.put("totalCount",TipoDocumentoSustentante.count)
		respond responseMap
	}
	
	def list(){
		respond TipoDocumentoSustentante.list()
	}
	
	def findAllByVersion(Long id){
		Long numeroVersion = id
		respond TipoDocumentoSustentante.findAllByVersion(numeroVersion)
	}
	
	def getExistingIds(){
		def idsToCompareJSON = params.'ids'

		List<Long> idsToCompare = new ArrayList<Long>()
		JSON.parse(idsToCompareJSON).each{
			idsToCompare.add(Long.valueOf(it))
		}

		def result = TipoDocumentoSustentante.executeQuery("select tpds.id from TipoDocumentoSustentante tpds where tpds.id in :ids",[ids:idsToCompare])
		respond result
	}
}
