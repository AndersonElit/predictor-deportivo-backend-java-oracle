package com.predictor.bot.obtenerequipos.service;

import java.util.List;

import com.predictor.bot.interfaces.IEquipoDAO;
import com.predictor.bot.interfaces.IEquipoService;
import com.predictor.bot.obtenerequipos.entidad.EquipoBean;
import com.predictor.bot.obtenerequipos.repository.EquipoDAO;

public class EquipoService implements IEquipoService {
	
	IEquipoDAO equipoDao = new EquipoDAO();
	
	public void insertarEquipo(EquipoBean equipo) {
		equipoDao.insertarEquipo(equipo);
	}
	
	public List<EquipoBean> listaEquipos() {
		return equipoDao.listaEquipos();
	}

}
