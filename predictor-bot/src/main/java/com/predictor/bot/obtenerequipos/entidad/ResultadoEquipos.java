package com.predictor.bot.obtenerequipos.entidad;

import java.util.List;

public class ResultadoEquipos {
	
	private List<String> equipos;
	private int codigoComparacion;
	private String mensajeComparacion;
	
	public ResultadoEquipos() {
		
	}
	
	public ResultadoEquipos(List<String> equipos, int codigoComparacion, String mensajeComparacion) {
		
		this.equipos = equipos;
		this.codigoComparacion = codigoComparacion;
		this.mensajeComparacion = mensajeComparacion;
		
	}
	
	public List<String> getEquipos() {
		return equipos;
	}
	
	public void setEquipos(List<String> equipos) {
		this.equipos = equipos;
	}
	
	public int getCodigoComparacion() {
		return codigoComparacion;
	}
	
	public void setCodigoComparacion(int codigoComparacion) {
		this.codigoComparacion = codigoComparacion;
	}
	
	public String getMensajeComparacion() {
		return mensajeComparacion;
	}
	
	public void setMensajeComparacion(String mensajeComparacion) {
		this.mensajeComparacion = mensajeComparacion;
	}

}
