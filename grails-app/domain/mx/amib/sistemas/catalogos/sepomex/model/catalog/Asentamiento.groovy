package mx.amib.sistemas.catalogos.sepomex.model.catalog

class Asentamiento {

	Long numeroVersion
	String clave
	String nombre
	Boolean vigente
	Municipio municipio

	static hasMany = [sepomexSet : Sepomex]
	static belongsTo = [Municipio]

	static mapping = {
		table 't303_c_asentamiento'
		
		id generator: "assigned"
		numeroVersion column:'nu_version'
		version false
		
		clave column:'cve_asentamiento'
		nombre column:'nb_asentamiento'
		vigente column:'st_vigente'
		municipio column:'id_302_municipio'
	}

	static constraints = {
		clave maxSize: 4
	}
}
