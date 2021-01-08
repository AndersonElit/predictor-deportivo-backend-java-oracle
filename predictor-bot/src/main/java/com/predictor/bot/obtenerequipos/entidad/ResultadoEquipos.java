package com.predictor.bot.obtenerequipos.entidad;

import java.util.List;

public class ResultadoEquipos {
	
	private List<String> equipos;
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

}
