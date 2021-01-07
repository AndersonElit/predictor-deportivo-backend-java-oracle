package com.predictor.bot.obtenerequipos.inter;

import com.predictor.bot.obtenerequipos.entidad.ResultadoEquipos;

public interface IObtenerEquipos {
	
	public ResultadoEquipos listaEquipos(String pais, String liga, String ligaUrl, int temporada, int categoria);

}
