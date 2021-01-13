package com.pronosticador.soccerstats.beans;

import java.io.Serializable;

@SuppressWarnings("serial")
public class EquipoBean implements Serializable {
	
	private String equipo;

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

}
