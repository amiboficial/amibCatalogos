package mx.amib.sistemas.catalogos.persona.model.catalog

class EstadoCivil {

    Long numeroVersion
	String descripcion
	Boolean vigente

	static mapping = {
		table 't205_c_edocivil'
		
		id generator: "identity"
		numeroVersion column:'nu_version'
		version false
		
		descripcion column:'ds_edocivil'
		vigente column:'st_vigente'
	}

	static constraints = {
		descripcion nullable: true, maxSize: 50
		vigente nullable: true
	}
	
}
