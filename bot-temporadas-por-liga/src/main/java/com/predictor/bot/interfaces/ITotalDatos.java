package com.predictor.bot.interfaces;

import com.predictor.bot.obtenerpartidos.entidad.TemporadasLiga;

public interface ITotalDatos {
	
	public TemporadasLiga listaTemporadas(String pais, String liga, String ligaUrl, int categoria);

}
