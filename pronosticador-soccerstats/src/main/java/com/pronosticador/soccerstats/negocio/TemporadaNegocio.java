package com.pronosticador.soccerstats.negocio;

import java.io.Serializable;

import com.pronosticador.soccerstats.beans.TemporadaBean;
import com.pronosticador.soccerstats.interfaces.ITemporadaNegocio;
import com.pronosticador.soccerstats.scraper.TemporadaScraper;
import com.pronosticador.soccerstats.serializar.Serializar;

@SuppressWarnings("serial")
public class TemporadaNegocio implements ITemporadaNegocio, Serializable {
	
	public void obtenerDatosTemporada(String ligaUrl) {
		TemporadaScraper.datosTemporada(ligaUrl);
	}
	
	public TemporadaBean deSerializarTemporada(String ligaUrl) {
		TemporadaBean temporada = Serializar.deSerializarTemporada(ligaUrl);
		return temporada;
	}

}
