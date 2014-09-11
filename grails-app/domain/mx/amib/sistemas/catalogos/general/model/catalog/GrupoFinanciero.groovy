package mx.amib.sistemas.catalogos.general.model.catalog

class GrupoFinanciero {
	String nombre
	Boolean vigente
	
	static mapping = {
		table 't104_c_gpofinanciero'
		
		id generator: "identity"
		
		nombre column:'nb_gpofinanciero'
		vigente column:'st_vigente'
		
		version false
	}
	
	static constraints = {
		nombre maxSize: 254
	}
}
