package mx.amib.sistemas.catalogos.general.model.marshalling

import mx.amib.sistemas.catalogos.general.model.catalog.Institucion
import grails.converters.JSON

class InstitucionMarshalling {
	void register(){
		JSON.registerObjectMarshaller(Institucion){ Institucion obj ->
			return [
				id:obj.id,
				numeroVersion:obj.numeroVersion,
				nombre:obj.nombre,
				vigente:obj.vigente,
				idTipoInstitucion:obj.tipoInstitucion.id,
				dsTipoInsitucion:obj.tipoInstitucion.descripcion,
				idGrupoFinanciero:obj.grupoFinanciero.id
			]
		}
	}
}
