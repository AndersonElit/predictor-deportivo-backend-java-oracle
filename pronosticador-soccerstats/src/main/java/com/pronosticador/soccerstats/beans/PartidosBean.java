package com.pronosticador.soccerstats.beans;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "partidos")
public class PartidosBean implements Serializable {
	
	private int numeroPartidos;
	private List<PartidoBean> partidos;
	
	public int getNumeroPartidos() {
		return numeroPartidos;
	}
	
	public void setNumeroPartidos(int numeroPartidos) {
		this.numeroPartidos = numeroPartidos;
	}

	public List<PartidoBean> getPartidos() {
		return partidos;
	}
	
	@XmlElement(name = "partido")
	public void setPartidos(List<PartidoBean> partidos) {
		this.partidos = partidos;
	}

}
