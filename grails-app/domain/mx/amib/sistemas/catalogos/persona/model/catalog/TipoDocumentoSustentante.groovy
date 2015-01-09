package mx.amib.sistemas.catalogos.persona.model.catalog

class TipoDocumentoSustentante {

	String descripcion
	Boolean vigente
	
	static mapping = {
		table 't204_c_tpdocsust'
		
		id generator: "assigned"
		
		descripcion column:'ds_tpdocsust'
		vigente column:'st_vigente'
	}
	
    static constraints = {
		descripcion nullable: false, maxSize: 100
    }
}
