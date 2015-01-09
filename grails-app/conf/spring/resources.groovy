// Place your Spring DSL code here
beans = {
	customObjectMarshallers( mx.amib.sistemas.catalogos.marshalling.CustomObjectMarshallers ) {
		marshallers = [
				new mx.amib.sistemas.catalogos.sepomex.model.marshalling.SepomexMarshalling(),
				new mx.amib.sistemas.catalogos.sepomex.model.marshalling.CiudadMarshalling(),
				new mx.amib.sistemas.catalogos.sepomex.model.marshalling.AsentamientoMarshalling(),
				new mx.amib.sistemas.catalogos.sepomex.model.marshalling.MunicipioMarshalling(),
				new mx.amib.sistemas.catalogos.sepomex.model.marshalling.EntidadFederativaMarshalling(),
				
				new mx.amib.sistemas.catalogos.general.model.marshalling.InstitucionMarshalling(),
				new mx.amib.sistemas.catalogos.general.model.marshalling.GrupoFinancieroMarshalling(),
				new mx.amib.sistemas.catalogos.general.model.marshalling.FiguraMarshalling(),
				new mx.amib.sistemas.catalogos.general.model.marshalling.VarianteFiguraMarshalling()
				
		]
	}
}
