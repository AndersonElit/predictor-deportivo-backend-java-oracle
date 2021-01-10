package com.predictor.bot.obtenerpartidos.entidad;

import java.io.Serializable;
import java.util.List;

public class PartidosPorFecha implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int fecha;	
	private List<Partido> partidos;
	
	public PartidosPorFecha() {
		
	}
	
	public PartidosPorFecha(int fecha, List<Partido> partidos) {
		this.fecha = fecha;
		this.partidos = partidos;
	}
	
	public int getFecha() {
		return fecha;
	}
	
	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

	public List<Partido> getPartidos() {
		return partidos;
	}

	public void setPartidos(List<Partido> partidos) {
		this.partidos = partidos;
	}
	
}
