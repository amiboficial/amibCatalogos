package mx.amib.sistemas.catalogos.datoscontrol.model

import grails.rest.*

/*@Resource(uri='/versionesCatalogos', formats=['json', 'xml'])*/
class VersionCatalogo {
	
	Integer numeroCatalogo
	Integer numeroVersion
	Date fechaVersion
	String observaciones

	static mapping = {
		table 't001_d_versioncat'
		
		id generator: "identity"
		
		numeroCatalogo column: 'nu_catalogo'
		numeroVersion column: 'nu_version'
		fechaVersion column: 'fh_version'
		observaciones column: 'tx_observaciones'
		
		version false
	}

	static constraints = {
		numeroVersion unique: ["numeroCatalogo"]
		observaciones maxSize: 1000
	}
}
