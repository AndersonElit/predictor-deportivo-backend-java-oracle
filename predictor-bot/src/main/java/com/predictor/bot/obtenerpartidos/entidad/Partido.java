package com.predictor.bot.obtenerpartidos.entidad;

public class Partido {
	
	private String local;
	private String visitante;
	private int golesLocal;
	private int golesVisitante;
	
	public Partido() {
		
	}
	
	public Partido(String local, String visitante, int golesLocal, int golesVisitante) {
		this.local = local;
		this.visitante = visitante;
		this.golesLocal = golesLocal;
		this.golesVisitante = golesVisitante;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getVisitante() {
		return visitante;
	}

	public void setVisitante(String visitante) {
		this.visitante = visitante;
	}
	
	public int getGolesLocal() {
		return golesLocal;
	}
	
	public void setGolesLocal(int golesLocal) {
		this.golesLocal = golesLocal;
	}

	public int getGolesVisitante() {
		return golesVisitante;
	}

	public void setGolesVisitante(int golesVisitante) {
		this.golesVisitante = golesVisitante;
	}

}
