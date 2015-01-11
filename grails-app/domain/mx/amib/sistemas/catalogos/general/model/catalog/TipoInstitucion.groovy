package mx.amib.sistemas.catalogos.general.model.catalog

class TipoInstitucion {

	Long numeroVersion
	String descripcion
	Boolean vigente

	//static hasMany = [instituciones: Institucion]

	static mapping = {
		table 't102_c_tpinstitucion'
		
		id generator: "identity"
		numeroVersion column:'nu_version'
		version false
		
		descripcion column:'ds_tpinstitucion'
		vigente column:'st_vigente'
		
		version false
	}

	static constraints = {
		descripcion nullable: true, maxSize: 100
		vigente nullable: true
	}
}
