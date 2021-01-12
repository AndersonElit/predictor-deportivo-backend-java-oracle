package com.predictor.bot.obtenerequipos.entidad;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "equipos")
public class EquiposResult {
	
	private List<EquipoBean> equiposResult;
	
	public List<EquipoBean> getEquiposResult() {
		return equiposResult;
	}
	
	@XmlElement(name = "equipo")
	public void setEquiposResult(List<EquipoBean> equiposResult) {
		this.equiposResult = equiposResult;
	}	

}
