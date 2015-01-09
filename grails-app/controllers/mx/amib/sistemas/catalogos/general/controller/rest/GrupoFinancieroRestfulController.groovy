package mx.amib.sistemas.catalogos.general.controller.rest;

import static org.springframework.http.HttpStatus.*
import mx.amib.sistemas.catalogos.general.model.catalog.GrupoFinanciero
import grails.rest.RestfulController
import grails.transaction.Transactional

@Transactional(readOnly = false)
public class GrupoFinancieroRestfulController extends RestfulController{

	static responseFormats = ['json', 'xml']
			
	GrupoFinancieroRestfulController() {
		super(GrupoFinanciero)
	}
	
	def totalCount(){
		TreeMap<String,Long> responseMap = new TreeMap<String,Long>()
		responseMap.put("totalCount",GrupoFinanciero.count)
		respond responseMap
	}
	
	def list(){
		respond GrupoFinanciero.list()
	}
	
	def findAllByVersion(Long id){
		Long numeroVersion = id
		respond GrupoFinanciero.findAllByVersion(numeroVersion)
	}
	
	def getExistingIds(){
		def idsToCompareJSON = params.'ids'

		List<Long> idsToCompare = new ArrayList<Long>()
		JSON.parse(idsToCompareJSON).each{
			idsToCompare.add(Long.valueOf(it))
		}

		def result = GrupoFinanciero.executeQuery("select gf.id from GrupoFinanciero gf where gf.id in :ids",[ids:idsToCompare])
		respond result
	}
}
