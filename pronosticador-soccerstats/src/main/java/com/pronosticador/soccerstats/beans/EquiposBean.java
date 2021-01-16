package com.pronosticador.soccerstats.beans;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "equipos")
public class EquiposBean implements Serializable {
	
	private int numeroEquipos;
	private List<String> equipos;
	private int partidosJugados;
	
	public EquiposBean() {
		
	}
	
	public int getNumeroEquipos() {
		return numeroEquipos;
	}
	
	public void setNumeroEquipos(int numeroEquipos) {
		this.numeroEquipos = numeroEquipos;
	}

	public int getPartidosJugados() {
		return partidosJugados;
	}

	public void setPartidosJugados(int partidosJugados) {
		this.partidosJugados = partidosJugados;
	}

	public List<String> getEquipos() {
		return equipos;
	}
	
	@XmlElement(name = "equipo")
	public void setEquipos(List<String> equipos) {
		this.equipos = equipos;
	}

}
