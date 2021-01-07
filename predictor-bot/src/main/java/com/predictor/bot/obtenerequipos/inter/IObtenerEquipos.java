package com.predictor.bot.obtenerequipos.inter;

import com.predictor.bot.obtenerequipos.entidad.ResultadoEquipos;

public interface IObtenerEquipos {
	
	public ResultadoEquipos listaEquipos(String liga, int temporada);

}
