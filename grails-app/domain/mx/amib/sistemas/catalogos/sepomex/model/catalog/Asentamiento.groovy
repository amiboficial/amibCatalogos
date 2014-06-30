package mx.amib.sistemas.catalogos.sepomex.model.catalog

class Asentamiento {

	String clave
	String nombre
	Boolean vigente
	Municipio municipio

	static hasMany = [sepomexSet : Sepomex]
	static belongsTo = [Municipio]

	static mapping = {
		table 't303_c_asentamiento'
		
		id generator: "assigned"
		
		clave column:'cve_asentamiento'
		nombre column:'nm_asentamiento'
		vigente column:'st_vigente'
		municipio column:'id_302_municipio'
		
		version false
	}

	static constraints = {
		clave maxSize: 4
	}
}
