package mx.amib.sistemas.catalogos.general.controller.rest

import static org.springframework.http.HttpStatus.*
import mx.amib.sistemas.catalogos.general.model.catalog.VarianteFigura
import grails.rest.RestfulController
import grails.transaction.Transactional
import grails.converters.JSON

@Transactional(readOnly = false)
class VarianteFiguraRestfulController extends RestfulController{

	static responseFormats = ['json', 'xml']
	
    VarianteFiguraRestfulController() {
		super(VarianteFigura)
	}
	
	def totalCount(){
		TreeMap<String,Long> responseMap = new TreeMap<String,Long>()
		responseMap.put("totalCount",VarianteFigura.count)
		respond responseMap
	}
	
	def list(){
		respond VarianteFigura.list()
	}
	
	def findAllByVersion(Long id){
		Long numeroVersion = id
		respond VarianteFigura.findAllByVersion(numeroVersion)
	}
	
	def getExistingIds(){
		def idsToCompareJSON = params.'ids'

		List<Long> idsToCompare = new ArrayList<Long>()
		JSON.parse(idsToCompareJSON).each{
			idsToCompare.add(Long.valueOf(it))
		}

		def result = VarianteFigura.executeQuery("select vf.id from VarianteFigura vf where vf.id in :ids",[ids:idsToCompare])
		respond result
	}
}
