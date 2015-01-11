package mx.amib.sistemas.catalogos.general.controller.rest

import static org.springframework.http.HttpStatus.*
import mx.amib.sistemas.catalogos.general.model.catalog.Figura
import grails.rest.RestfulController
import grails.transaction.Transactional

@Transactional(readOnly = false)
class FiguraRestfulController extends RestfulController{

	static responseFormats = ['json', 'xml']
	
	FiguraRestfulController() {
		super(Figura)
	}
	
	def totalCount(){
		TreeMap<String,Long> responseMap = new TreeMap<String,Long>()
		responseMap.put("totalCount",Figura.count)
		respond responseMap
	}
	
	def list(){
		respond Figura.list()
	}
	
	def findAllByNumeroVersion(Long id){
		Long numeroVersion = id
		respond Figura.findAllByNumeroVersion(numeroVersion)
	}
	
	def getExistingIds(){
		def idsToCompareJSON = params.'ids'

		List<Long> idsToCompare = new ArrayList<Long>()
		JSON.parse(idsToCompareJSON).each{
			idsToCompare.add(Long.valueOf(it))
		}

		def result = Figura.executeQuery("select f.id from Figura f where f.id in :ids",[ids:idsToCompare])
		respond result
	}
}
