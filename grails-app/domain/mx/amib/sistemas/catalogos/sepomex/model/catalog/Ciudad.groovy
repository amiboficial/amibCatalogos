package mx.amib.sistemas.catalogos.sepomex.model.catalog

class Ciudad {

	String clave
	String nombre
	Boolean vigente
	Municipio municipio

	static hasMany = [sepomexSet: Sepomex]
	static belongsTo = [Municipio]

	static mapping = {
		table 't304_c_ciudad'
		
		id generator: "assigned"
		
		
		clave column:'cve_ciudad'
		nombre column:'nm_ciudad'
		vigente column:'st_vigente'
		municipio column:'id_302_municipio'
		
		version false
	}

	static constraints = {
		clave maxSize: 2
	}
}
