package com.pronosticador.soccerstats.beans;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
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

	public void setPartidos(List<PartidoBean> partidos) {
		this.partidos = partidos;
	}

}
