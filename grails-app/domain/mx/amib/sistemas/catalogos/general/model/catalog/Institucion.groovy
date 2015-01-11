package mx.amib.sistemas.catalogos.general.model.catalog

class Institucion {

	Long numeroVersion
	String nombre
	Boolean vigente
	TipoInstitucion tipoInstitucion
	GrupoFinanciero grupoFinanciero
	
	static belongsTo = [TipoInstitucion, GrupoFinanciero]

	static mapping = {
		table 't101_c_institucion'
		
		id generator: "identity"
		numeroVersion column:'nu_version'
		version false
		
		nombre column:'nb_institucion'
		vigente column:'st_vigente'
		tipoInstitucion column:'id_102_tpinstitucion'
		grupoFinanciero column:'id_104_gpofinanciero'
		
	}

	static constraints = {
		nombre maxSize: 254
	}
}
