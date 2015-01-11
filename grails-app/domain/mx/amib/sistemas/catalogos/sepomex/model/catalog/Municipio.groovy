package mx.amib.sistemas.catalogos.sepomex.model.catalog

import grails.rest.*

/*@Resource(uri='/municipios', formats=['json', 'xml'])*/
class Municipio {

	Long numeroVersion
	String clave
	String nombre
	Boolean vigente
	EntidadFederativa entidadFederativa

	static hasMany = [asentamiento: Asentamiento,
	                  ciudades: Ciudad]
	static belongsTo = [EntidadFederativa]

	static mapping = {
		table 't302_c_municipio'
		
		id generator: "assigned"
		numeroVersion column:'nu_version'
		version false
		
		clave column:'cve_municipio'
		nombre column:'nb_municipio'
		vigente column:'st_vigente'
		entidadFederativa column:'id_301_entidadfed'
	}

	static constraints = {
		clave maxSize: 3
		nombre maxSize: 150
	}
}
