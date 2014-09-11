package mx.amib.sistemas.catalogos.sepomex.model.catalog

import grails.rest.*

/*@Resource(uri='/entidadesFederativas', formats=['json', 'xml'])*/
class EntidadFederativa {

	String clave
	String nombre
	Boolean vigente

	static hasMany = [municipios: Municipio]

	static mapping = {
		table 't301_c_entidadfed'
		
		id generator: "assigned"
		version 'nu_rev'
		
		clave column:'cve_entidadfed'
		nombre column:'nb_entidadfed'
		vigente column:'st_vigente'
	}

	static constraints = {
		clave maxSize: 2
		nombre maxSize: 100
	}
}
