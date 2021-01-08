package com.predictor.bot.interfaces;

import com.predictor.bot.obtenerpartidos.entidad.ResultadoPartidos;

public interface IObtenerPartidos {
	
	public ResultadoPartidos listaPartidos(String pais, String liga, String ligaUrl, int categoria, int numeroFechas, int temporada);

}
