package mx.amib.sistemas.catalogos.general.model.catalog

class Institucion {

	String nombre
	Boolean vigente
	TipoInstitucion tipoInstitucion
	GrupoFinanciero grupoFinanciero
	
	static belongsTo = [TipoInstitucion, GrupoFinanciero]

	static mapping = {
		table 't101_c_institucion'
		
		id generator: "identity"
		
		nombre column:'nb_institucion'
		vigente column:'st_vigente'
		tipoInstitucion column:'id_102_tpinstitucion'
		grupoFinanciero column:'id_104_gpofinanciero'
		
		version false
	}

	static constraints = {
		nombre maxSize: 254
	}
}
