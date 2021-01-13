package com.pronosticador.soccerstats.interfaces;

import com.pronosticador.soccerstats.beans.TemporadaBean;

public interface ITemporadaNegocio {
	
	public void obtenerDatosTemporada(String ligaUrl);
	
	public TemporadaBean deSerializarTemporada(String ligaUrl);

}
