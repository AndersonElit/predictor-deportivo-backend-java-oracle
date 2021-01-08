package com.predictor.bot.obtenerpartidos.entidad;

import java.util.List;

public class ResultadoPartidos {
	
	private List<FechasTemporada> listaTemporadas;
	
	public ResultadoPartidos() {
		
	}
	
	public ResultadoPartidos(List<FechasTemporada> listaTemporadas) {
		this.listaTemporadas = listaTemporadas;
	}

	public List<FechasTemporada> getListaTemporadas() {
		return listaTemporadas;
	}

	public void setListaTemporadas(List<FechasTemporada> listaTemporadas) {
		this.listaTemporadas = listaTemporadas;
	}
	
	

}
