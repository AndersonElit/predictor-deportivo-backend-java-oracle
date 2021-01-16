package com.pronosticador.soccerstats.beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "datostemporada")
public class TemporadaBean implements Serializable {
	
	private String pais;
	private String liga;
	private int temporada;
	private EquiposBean equipos;
	private PartidosBean partidos;
	
	public TemporadaBean() {
		
	}
	
	public TemporadaBean(String pais, int temporada, EquiposBean equipos, PartidosBean partidos) {
		this.pais = pais;
		this.temporada = temporada;
		this.equipos = equipos;
		this.partidos = partidos;
	}	
	
	public String getPais() {
		return pais;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getTemporada() {
		return temporada;
	}

	public void setTemporada(int temporada) {
		this.temporada = temporada;
	}

	public EquiposBean getEquipos() {
		return equipos;
	}
	
	@XmlElement(name = "equipos")
	public void setEquipos(EquiposBean equipos) {
		this.equipos = equipos;
	}

	public PartidosBean getPartidos() {
		return partidos;
	}
	
	@XmlElement(name = "partidos")
	public void setPartidos(PartidosBean partidos) {
		this.partidos = partidos;
	}

	public String getLiga() {
		return liga;
	}

	public void setLiga(String liga) {
		this.liga = liga;
	}

}
