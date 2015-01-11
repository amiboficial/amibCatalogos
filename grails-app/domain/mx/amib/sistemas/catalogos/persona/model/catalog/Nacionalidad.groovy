package mx.amib.sistemas.catalogos.persona.model.catalog

class Nacionalidad {

	Long numeroVersion
	String descripcion
	Boolean vigente

	static mapping = {
		table 't201_c_nacionalidad'
		
		id generator: "identity"
		numeroVersion column:'nu_version'
		version false
		
		descripcion column:'ds_nacionalidad'
		vigente column:'st_vigente'
	}

	static constraints = {
		descripcion nullable: true, maxSize: 50
		vigente nullable: true
	}
}
