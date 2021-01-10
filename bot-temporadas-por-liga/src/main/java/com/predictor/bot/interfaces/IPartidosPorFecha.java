package com.predictor.bot.interfaces;

import com.predictor.bot.obtenerpartidos.entidad.PartidosPorFecha;

public interface IPartidosPorFecha {
	
	public PartidosPorFecha listaPartidos(String ligaUrl, int temporada, int jornada);

}
