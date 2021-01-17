package com.pronosticador.soccerstats.negocio;

import java.io.Serializable;
import java.util.List;

import com.pronosticador.soccerstats.interfaces.ITemporadaNegocio;
import com.pronosticador.soccerstats.scraper.TemporadaScraper;
import com.pronosticador.soccerstats.serializar.Serializar;

@SuppressWarnings("serial")
public class TemporadaNegocio implements ITemporadaNegocio, Serializable {
	
	public void obtenerDatosTemporada(String ligaUrl) {
		TemporadaScraper.datosTemporada(ligaUrl);
		
	}
	
	public List<String> listaArchivosXml() {
		List<String> listaArchivosXml = Serializar.listaArchivosXml();
		return listaArchivosXml;
	}
	
	public String extraerXmlTexto(String nombreArchivo) {
		String xmlTexto = Serializar.extraerXmlTexto(nombreArchivo);
		return xmlTexto;
	}

}
