package mx.amib.sistemas.catalogos.general.controller.rest

import static org.springframework.http.HttpStatus.*
import mx.amib.sistemas.catalogos.general.model.catalog.Institucion
import grails.rest.RestfulController
import grails.transaction.Transactional

@Transactional(readOnly = false)
class InstitucionRestfulController extends RestfulController{

	static responseFormats = ['json', 'xml']
	
	InstitucionRestfulController() {
		super(Institucion)
	}
	
	def totalCount(){
		TreeMap<String,Long> responseMap = new TreeMap<String,Long>()
		responseMap.put("totalCount",Institucion.count)
		respond responseMap
	}
	
	def list(){
		respond Institucion.list()
	}
	
	def findAllByVersion(Long id){
		Long numeroVersion = id
		respond Institucion.findAllByVersion(numeroVersion)
	}
	
	def getExistingIds(){
		def idsToCompareJSON = params.'ids'

		List<Long> idsToCompare = new ArrayList<Long>()
		JSON.parse(idsToCompareJSON).each{
			idsToCompare.add(Long.valueOf(it))
		}

		def result = Institucion.executeQuery("select ins.id from Institucion ins where ins.id in :ids",[ids:idsToCompare])
		respond result
	}
	
}
