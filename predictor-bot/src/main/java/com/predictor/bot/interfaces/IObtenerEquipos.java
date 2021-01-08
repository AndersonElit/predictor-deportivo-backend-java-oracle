package com.predictor.bot.interfaces;

import com.predictor.bot.obtenerequipos.entidad.ResultadoEquipos;

public interface IObtenerEquipos {
	
	public ResultadoEquipos listaEquipos(String ligaUrl, int temporada);

}
