package com.pronosticador.soccerstats.equipos.beans;

import java.util.List;

public class EquiposBean {
	
	private int numeroEquipos;
	private List<String> equipos;
	
	public EquiposBean() {
		
	}
	
	public EquiposBean(int numeroEquipos, List<String> equipos) {
		this.numeroEquipos = numeroEquipos;
		this.equipos = equipos;
	}
	
	public int getNumeroEquipos() {
		return numeroEquipos;
	}
	
	public void setNumeroEquipos(int numeroEquipos) {
		this.numeroEquipos = numeroEquipos;
	}

	public List<String> getEquipos() {
		return equipos;
	}

	public void setEquipos(List<String> equipos) {
		this.equipos = equipos;
	}

}
