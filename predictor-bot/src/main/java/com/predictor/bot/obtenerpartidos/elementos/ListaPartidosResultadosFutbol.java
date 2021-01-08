package com.predictor.bot.obtenerpartidos.elementos;

import java.util.ArrayList;
import java.util.List;

import com.predictor.bot.interfaces.IFechasTemporada;
import com.predictor.bot.interfaces.IObtenerEquipos;
import com.predictor.bot.interfaces.IPartidosPorFecha;
import com.predictor.bot.obtenerequipos.composition.ObtenerEquiposResultadosFutbol;
import com.predictor.bot.obtenerequipos.entidad.ResultadoEquipos;
import com.predictor.bot.obtenerpartidos.entidad.FechasTemporada;
import com.predictor.bot.obtenerpartidos.entidad.PartidosPorFecha;

public class ListaPartidosResultadosFutbol implements IFechasTemporada {
	
	public FechasTemporada listaFechas(String ligaUrl, int temporada) {
		
		FechasTemporada fechasTemporada = new FechasTemporada();
		List<PartidosPorFecha> listaFechas = new ArrayList<PartidosPorFecha>();
		
		IObtenerEquipos equiposObj = new ObtenerEquiposResultadosFutbol();
		ResultadoEquipos equipos = equiposObj.listaEquipos(ligaUrl, temporada);
		int numeroEquipos = equipos.getNumeroEquipos();
		int numeroFechas = (numeroEquipos - 1)*2;
		int jornada = 1;
		
		while ( jornada <= numeroFechas ) {
			
			IPartidosPorFecha partidosPorFecha = new PartidosPorFechaResultadosFutbol();
			PartidosPorFecha partidosObj = partidosPorFecha.listaPartidos(ligaUrl, temporada, jornada);
			listaFechas.add(partidosObj);
			jornada++;
		}
		
		fechasTemporada.setEquiposObj(equipos);
		fechasTemporada.setListaFechas(listaFechas);
		fechasTemporada.setTemporada(temporada);
		
		return fechasTemporada;
	}
	

}
