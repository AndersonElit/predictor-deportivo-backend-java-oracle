package com.predictor.bot.obtenerpartidos.entidad;

import java.io.Serializable;
import java.util.List;

import com.predictor.bot.obtenerequipos.entidad.ResultadoEquipos;

public class FechasTemporada implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int temporada;
	private ResultadoEquipos equiposObj;
	private List<PartidosPorFecha> listaFechas;
	
	public FechasTemporada() {
		
	}
	
	public FechasTemporada(int temporada, List<PartidosPorFecha> listaFechas) {
		this.temporada = temporada;
		this.listaFechas = listaFechas;
	}
	
	public int getTemporada() {
		return temporada;
	}
	
	public void setTemporada(int temporada) {
		this.temporada = temporada;
	}

	public List<PartidosPorFecha> getListaFechas() {
		return listaFechas;
	}

	public void setListaFechas(List<PartidosPorFecha> listaFechas) {
		this.listaFechas = listaFechas;
	}

	public ResultadoEquipos getEquiposObj() {
		return equiposObj;
	}

	public void setEquiposObj(ResultadoEquipos equiposObj) {
		this.equiposObj = equiposObj;
	}

}
