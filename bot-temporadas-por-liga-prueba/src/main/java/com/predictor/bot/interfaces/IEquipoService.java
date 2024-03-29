package com.predictor.bot.interfaces;

import java.util.List;

import com.predictor.bot.obtenerequipos.entidad.EquipoBean;

public interface IEquipoService {
	
	public void insertarEquipo(EquipoBean equipo);
	
	public void insertarEquiposXml(List<EquipoBean> listaEquipos);
	
	public List<EquipoBean> listaEquipos();

}
