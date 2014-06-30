package mx.amib.sistemas.catalogos.persona.model.catalog

class NivelEstudios {

	String descripcion
	Boolean vigente

	static mapping = {
		table 't202_c_nivelestudios'
		
		id generator: "identity"
		
		descripcion column:'ds_nivelestudios'
		vigente column:'st_vigente'
		
		version false
	}

	static constraints = {
		descripcion nullable: true, maxSize: 50
		vigente nullable: true
	}
}
