package mx.amib.sistemas.catalogos.persona.model.catalog

class TipoTelefono {

	String descripcion
	Boolean vigente
	
	static mapping = {
		table 't203_c_tptelefono'
		
		id generator: "assigned"
		
		descripcion column:'ds_tptelefono'
		vigente column:'st_vigente'
	}
	
    static constraints = {
		descripcion nullable: false, maxSize: 254
    }
}
