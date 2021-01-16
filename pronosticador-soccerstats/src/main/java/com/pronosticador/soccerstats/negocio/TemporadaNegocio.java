package com.pronosticador.soccerstats.negocio;

import java.io.Serializable;
import com.pronosticador.soccerstats.interfaces.ITemporadaNegocio;
import com.pronosticador.soccerstats.scraper.TemporadaScraper;

@SuppressWarnings("serial")
public class TemporadaNegocio implements ITemporadaNegocio, Serializable {
	
	public void obtenerDatosTemporada(String ligaUrl) {
		TemporadaScraper.datosTemporada(ligaUrl);
		
	}

}
