package com.predictor.bot.interfaces;

import com.predictor.bot.obtenerpartidos.entidad.TemporadasLiga;

public interface ISerializarLiga {
	
	public void serializarLiga(TemporadasLiga datosLiga);
	
	public TemporadasLiga deserializarLiga(String nombreArchivo);

}
