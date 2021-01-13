package com.pronosticador.soccerstats.beans;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
public class EquiposBean implements Serializable {
	
	private int numeroEquipos;
	private List<EquipoBean> equipos;
	
	public EquiposBean() {
		
	}
	
	public EquiposBean(int numeroEquipos, List<EquipoBean> equipos) {
		this.numeroEquipos = numeroEquipos;
		this.equipos = equipos;
	}
	
	public int getNumeroEquipos() {
		return numeroEquipos;
	}
	
	public void setNumeroEquipos(int numeroEquipos) {
		this.numeroEquipos = numeroEquipos;
	}

	public List<EquipoBean> getEquipos() {
		return equipos;
	}

	public void setEquipos(List<EquipoBean> equipos) {
		this.equipos = equipos;
	}

}
