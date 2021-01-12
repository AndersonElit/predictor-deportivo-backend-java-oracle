package com.predictor.bot.obtenerpartidos.entidad;

import java.io.Serializable;
import java.util.List;

public class TemporadasLiga implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String pais;
	private String liga;
	private int categoria;
	private List<FechasTemporada> listaTemporadas;
	
	public String getPais() {
		return pais;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getLiga() {
		return liga;
	}

	public void setLiga(String liga) {
		this.liga = liga;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public List<FechasTemporada> getListaTemporadas() {
		return listaTemporadas;
	}

	public void setListaTemporadas(List<FechasTemporada> listaTemporadas) {
		this.listaTemporadas = listaTemporadas;
	}

}
