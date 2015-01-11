package mx.amib.sistemas.catalogos.sepomex.model.catalog

class Sepomex {

	Long numeroVersion
	String codigoPostal
	Boolean vigente
	Ciudad ciudad
	Asentamiento asentamiento

	static belongsTo = [Asentamiento, Ciudad]

	static mapping = {
		table 't305_c_sepomex'
		
		id generator: "assigned"
		numeroVersion column:'nu_version'
		version false
		
		codigoPostal column:'cve_codigopostal'
		vigente column:'st_vigente'
		ciudad column:'id_304_ciudad'
		asentamiento column:'id_303_asentamiento'
	}

	static constraints = {
		codigoPostal maxSize: 5
	}
}
