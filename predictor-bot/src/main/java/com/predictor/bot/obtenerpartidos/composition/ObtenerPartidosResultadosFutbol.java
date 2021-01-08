package com.predictor.bot.obtenerpartidos.composition;

import com.predictor.bot.interfaces.IObtenerPartidos;
import com.predictor.bot.obtenerpartidos.entidad.ResultadoPartidos;

public class ObtenerPartidosResultadosFutbol implements IObtenerPartidos {
	
	private String baseUrl = "https://www.resultados-futbol.com/";
	private String url = "";
	
	public ResultadoPartidos listaPartidos(String pais, String liga, String ligaUrl, int categoria, int numeroFechas, int temporada) {
		
		int jornada = 1;
		
		while ( jornada <= numeroFechas ) {
			
			url = baseUrl + ligaUrl + temporada + "/grupo1/jornada" + jornada;
			jornada++;
			
		}
		
		//int numeroEquipos = equipos.getNumeroEquipos();
		//int numeroFechas = (numeroEquipos - 1)*2;
		
		return null;
	}

}
