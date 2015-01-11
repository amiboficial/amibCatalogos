package mx.amib.sistemas.catalogos.general.model.catalog

class VarianteFigura {

	Long numeroVersion
	String nombre
	Boolean vigente
	
	Figura figura
	
	static belongsTo = [Figura]
	
	static mapping = {
		table 't105_c_varfigura'
		
		id generator: "assigned"
		
		numeroVersion column: 'nu_version'
		
		nombre column:'nb_varfigura'
		vigente column:'st_vigente'
		
		figura column:'id_103_figura'
		
		version false
	}
	
    static constraints = {
		nombre nullable: false, maxSize: 254
    }
}
