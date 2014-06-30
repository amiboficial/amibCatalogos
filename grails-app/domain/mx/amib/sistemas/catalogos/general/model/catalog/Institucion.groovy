package mx.amib.sistemas.catalogos.general.model.catalog

class Institucion {

	String nombre
	Boolean vigente
	TipoInstitucion tipoInstitucion

	static belongsTo = [TipoInstitucion]

	static mapping = {
		table 't101_c_institucion'
		
		id generator: "identity"
		
		nombre column:'nm_institucion'
		vigente column:'st_vigente'
		tipoInstitucion column:'id_102_tpinstitucion'
		
		version false
	}

	static constraints = {
		nombre maxSize: 254
	}
}
