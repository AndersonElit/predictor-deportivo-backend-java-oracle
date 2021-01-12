package com.predictor.bot.interfaces;

import org.jsoup.nodes.Element;

import com.predictor.bot.obtenerpartidos.entidad.Partido;

public interface IObtenerPartido {
	
	public Partido datosPartido(Element tr);

}
