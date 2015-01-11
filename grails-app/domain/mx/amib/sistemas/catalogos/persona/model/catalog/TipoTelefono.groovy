package mx.amib.sistemas.catalogos.persona.model.catalog

class TipoTelefono {

	Long numeroVersion
	String descripcion
	Boolean vigente
	
	static mapping = {
		table 't203_c_tptelefono'
		
		id generator: "assigned"
		numeroVersion column:'nu_version'
		version false
		
		descripcion column:'ds_tptelefono'
		vigente column:'st_vigente'
	}
	
    static constraints = {
		descripcion nullable: false, maxSize: 254
    }
}
