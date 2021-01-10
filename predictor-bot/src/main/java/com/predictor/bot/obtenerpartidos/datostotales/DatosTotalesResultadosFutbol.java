package com.predictor.bot.obtenerpartidos.datostotales;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.predictor.bot.interfaces.IFechasTemporada;
import com.predictor.bot.interfaces.ITotalDatos;
import com.predictor.bot.obtenerpartidos.elementos.ListaPartidosResultadosFutbol;
import com.predictor.bot.obtenerpartidos.entidad.FechasTemporada;
import com.predictor.bot.obtenerpartidos.entidad.TemporadasLiga;

public class DatosTotalesResultadosFutbol implements ITotalDatos, Serializable {
	
	private static final long serialVersionUID = 1L;

	public TemporadasLiga listaTemporadas(String pais, String liga, String ligaUrl, int categoria) {
		
		TemporadasLiga datosTotales = new TemporadasLiga();
		List<FechasTemporada> listaTemporadas = new ArrayList<FechasTemporada>();
		int temporada = 2000;
		
		while ( temporada <= 2019 ) {
			System.out.println("Obteniendo datos temporada " + temporada + "..................");
			IFechasTemporada partidosTemporadaObj = new ListaPartidosResultadosFutbol();
			FechasTemporada partidosTemporada = partidosTemporadaObj.listaFechas(ligaUrl, temporada);
			listaTemporadas.add(partidosTemporada);
			temporada++;
		}
		
		datosTotales.setPais(pais);
		datosTotales.setLiga(liga);
		datosTotales.setCategoria(categoria);
		datosTotales.setListaTemporadas(listaTemporadas);
		
		return datosTotales;
	}

}
