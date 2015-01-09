package mx.amib.sistemas.catalogos.general.model.catalog

class Figura {

	String nombre
	String nombreAcuse
	Boolean esAutorizable
	String tipoAutorizacion
	String iniciales
	
	Boolean vigente

	static hasMany = [variantes:VarianteFigura]
	
	static mapping = {
		table 't103_c_figura'
		
		id generator: "assigned"
		
		nombre column:'nb_figura'
		nombreAcuse column:'nb_acuse'
		esAutorizable column:'st_autorizable'
		tipoAutorizacion column:'ds_tpautorizacion'
		iniciales column:'nb_iniciales'
		
		vigente column:'st_vigente'
	}

	static constraints = {
		nombre nullable: false, maxSize: 254
		nombreAcuse nullable: true, maxSize:254
		esAutorizable nullable: false, maxSize:'st_autorizable'
		tipoAutorizacion nullable: true, maxSize:254
		iniciales nullable: true, maxSize:24
	}
}
