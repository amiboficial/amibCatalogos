package mx.amib.sistemas.catalogos.persona.model.catalog

class TipoDocumentoSustentante {

	Long numeroVersion
	String descripcion
	Boolean vigente
	
	static mapping = {
		table 't204_c_tpdocsust'
		
		id generator: "assigned"
		numeroVersion column:'nu_version'
		version false
		
		descripcion column:'ds_tpdocsust'
		vigente column:'st_vigente'
	}
	
    static constraints = {
		descripcion nullable: false, maxSize: 100
    }
}
