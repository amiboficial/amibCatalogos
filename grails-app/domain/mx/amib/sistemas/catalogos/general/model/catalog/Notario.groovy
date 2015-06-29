package mx.amib.sistemas.catalogos.general.model.catalog

class Notario {
	Long numeroVersion
	Long idEntidadFederativa
	Integer numeroNotaria
	String nombreCompleto
	Boolean vigente
	Date fechaCreacion
	Date fechaModificacion
	
	static mapping = {
		table 't106_t_notario'
		
		id generator: "identity"
		version false
		
		numeroVersion column:'nu_version'
		idEntidadFederativa column:'id_301_entidadfed'
		numeroNotaria column:'nu_notaria'
		nombreCompleto column:'nb_nombrecompleto'
		vigente column:'st_vigente'
		fechaCreacion column:'fh_creacion'
		fechaModificacion column:'fh_modificacion'
	}
	static constraints = {
		nombreCompleto maxSize: 300
	}
}
