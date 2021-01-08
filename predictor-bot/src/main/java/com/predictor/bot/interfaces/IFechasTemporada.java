package com.predictor.bot.interfaces;

import com.predictor.bot.obtenerpartidos.entidad.FechasTemporada;

public interface IFechasTemporada {
	
	FechasTemporada listaFechas(String ligaUrl, int temporada);

}
