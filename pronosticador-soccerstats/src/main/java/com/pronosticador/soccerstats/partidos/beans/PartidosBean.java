package com.pronosticador.soccerstats.partidos.beans;

import java.util.List;

public class PartidosBean {
	
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
