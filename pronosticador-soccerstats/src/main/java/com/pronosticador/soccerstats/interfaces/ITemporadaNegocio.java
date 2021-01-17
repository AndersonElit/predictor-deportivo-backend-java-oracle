package com.pronosticador.soccerstats.interfaces;

import java.util.List;

public interface ITemporadaNegocio {
	
	public void obtenerDatosTemporada(String ligaUrl);
	
	public List<String> listaArchivosXml();
	
	public String extraerXmlTexto(String nombreArchivo);

}
