package mx.amib.sistemas.catalogos.general.model.catalog

class GrupoFinanciero {
	Long numeroVersion
	String nombre
	Boolean vigente
	
	static hasMany = [instituciones:Institucion]
	
	static mapping = {
		table 't104_c_gpofinanciero'
		
		id generator: "identity"
		numeroVersion column:'nu_version'
		version false
		
		nombre column:'nb_gpofinanciero'
		vigente column:'st_vigente'
		
		version false
	}
	
	static constraints = {
		nombre maxSize: 254
	}
}
