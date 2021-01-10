package com.predictor.bot.obtenerpartidos.entidad;

import java.io.Serializable;
import java.util.List;

public class ResultadoPartidos implements Serializable {
	
	private static final long serialVersionUID = 1L;
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
