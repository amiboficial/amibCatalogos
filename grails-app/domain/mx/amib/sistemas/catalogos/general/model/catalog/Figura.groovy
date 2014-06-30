package mx.amib.sistemas.catalogos.general.model.catalog

class Figura {

	String descripcion
	Boolean vigente

	static mapping = {
		table 't103_c_figura'
		
		id generator: "identity"
		
		descripcion column:'ds_figura'
		vigente column:'st_vigente'
		
		version false
	}

	static constraints = {
		descripcion maxSize: 254
	}
}
