package com.pronosticador.soccerstats.beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "partido")
public class PartidoBean implements Serializable {
	
	private String local;
	private String visitante;
	private int golesLocal;
	private int golesVisitante;
	
	public PartidoBean() {
		
	}
	
	public PartidoBean(String local, String visitante, int golesLocal, int golesVisitante) {
		this.local = local;
		this.visitante = visitante;
		this.golesLocal = golesLocal;
		this.golesVisitante = golesVisitante;
	}

	public String getLocal() {
		return local;
	}
	
	@XmlElement(name = "local")
	public void setLocal(String local) {
		this.local = local;
	}

	public String getVisitante() {
		return visitante;
	}
	
	@XmlElement(name = "visitante")
	public void setVisitante(String visitante) {
		this.visitante = visitante;
	}
	
	public int getGolesLocal() {
		return golesLocal;
	}
	
	@XmlElement(name = "goleslocal")
	public void setGolesLocal(int golesLocal) {
		this.golesLocal = golesLocal;
	}

	public int getGolesVisitante() {
		return golesVisitante;
	}
	
	@XmlElement(name = "golesvisitante")
	public void setGolesVisitante(int golesVisitante) {
		this.golesVisitante = golesVisitante;
	}

}
