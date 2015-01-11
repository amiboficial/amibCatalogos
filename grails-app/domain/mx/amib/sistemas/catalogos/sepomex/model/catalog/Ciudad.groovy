package mx.amib.sistemas.catalogos.sepomex.model.catalog

class Ciudad {

	Long numeroVersion
	String clave
	String nombre
	Boolean vigente
	Municipio municipio

	static hasMany = [sepomexSet: Sepomex]
	static belongsTo = [Municipio]

	static mapping = {
		table 't304_c_ciudad'
		
		id generator: "assigned"
		numeroVersion column:'nu_version'
		version false
		
		clave column:'cve_ciudad'
		nombre column:'nb_ciudad'
		vigente column:'st_vigente'
		municipio column:'id_302_municipio'
	}

	static constraints = {
		clave maxSize: 2
	}
}
