package com.predictor.bot.obtenerpartidos.elementos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.predictor.bot.interfaces.IEquiposCoinciden;
import com.predictor.bot.interfaces.IFechasTemporada;
import com.predictor.bot.interfaces.IObtenerEquipos;
import com.predictor.bot.interfaces.IPartidosPorFecha;
import com.predictor.bot.obtenerequipos.composicion.ObtenerEquiposResultadosFutbol;
import com.predictor.bot.obtenerequipos.entidad.ResultadoEquipos;
import com.predictor.bot.obtenerequipos.equiposcoinciden.EquiposCoinciden;
import com.predictor.bot.obtenerpartidos.entidad.FechasTemporada;
import com.predictor.bot.obtenerpartidos.entidad.Partido;
import com.predictor.bot.obtenerpartidos.entidad.PartidosPorFecha;

public class ListaPartidosResultadosFutbol implements IFechasTemporada, Serializable {
	
	private static final long serialVersionUID = 1L;

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
		
		//como List<String> listaEequipos no coincide con listaFechas toca crear un nuevo objeto
		//con un nuevo listado de equipos extraido de la primera fecha
		
		PartidosPorFecha partidosFecha = listaFechas.get(0);
		List<String> listaEequipos = new ArrayList<String>();
		List<Partido> partidos = partidosFecha.getPartidos();
		
		for (Partido partido : partidos) {
			
			String local = partido.getLocal();
			String visitante = partido.getVisitante();
			listaEequipos.add(local);
			listaEequipos.add(visitante);
			
		}
		
		equipos.setEquipos(listaEequipos);
		
		//verificar si coincide nombre lista equipos con equipos de cada partido-------------------------
		
		IEquiposCoinciden compararEquipos = new EquiposCoinciden();
		compararEquipos.compararEquipos(listaFechas, listaEequipos, temporada);
		
		//-----------------------------------------------------------------------------------------------
		
		fechasTemporada.setEquiposObj(equipos);
		fechasTemporada.setListaFechas(listaFechas);
		fechasTemporada.setTemporada(temporada);
		
		return fechasTemporada;
	}
	

}
