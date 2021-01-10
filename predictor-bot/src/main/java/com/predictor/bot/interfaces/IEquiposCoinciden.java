package com.predictor.bot.interfaces;

import java.util.List;

import com.predictor.bot.obtenerpartidos.entidad.PartidosPorFecha;

public interface IEquiposCoinciden {
	
	public void compararEquipos(List<PartidosPorFecha> listaFechas, List<String> listaEequipos, int temporada);

}
