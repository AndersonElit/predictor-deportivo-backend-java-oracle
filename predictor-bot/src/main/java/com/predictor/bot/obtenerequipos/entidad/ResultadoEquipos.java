package com.predictor.bot.obtenerequipos.entidad;

import java.util.List;

public class ResultadoEquipos {
	
	private String pais;
	private String liga;
	private List<String> equipos;
	private int categoria;
	private int numeroEquipos;
	
	public ResultadoEquipos() {
		
	}
	
	public ResultadoEquipos(List<String> equipos, int numeroEquipos) {
		
		this.equipos = equipos;
		this.numeroEquipos = numeroEquipos;
		
	}
	
	public List<String> getEquipos() {
		return equipos;
	}
	
	public void setEquipos(List<String> equipos) {
		this.equipos = equipos;
	}

	public int getNumeroEquipos() {
		return numeroEquipos;
	}

	public void setNumeroEquipos(int numeroEquipos) {
		this.numeroEquipos = numeroEquipos;
	}

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

}
