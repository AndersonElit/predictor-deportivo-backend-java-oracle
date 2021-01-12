package com.predictor.bot.obtenerequipos.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.predictor.bot.interfaces.IEquipoDAO;
import com.predictor.bot.obtenerequipos.entidad.EquipoBean;
import com.predictor.bot.obtenerequipos.entidad.EquiposResult;

public class EquipoDAO implements IEquipoDAO {
	
	SqlSession session = null;
	
	public void insertarEquipo(EquipoBean equipo) {
		
		try {
			
			session = MybatisUtils.getSqlSessionFactory().openSession();
			EquipoBean nuevoEquipo = new EquipoBean();
			nuevoEquipo.setId(equipo.getId());
			nuevoEquipo.setNombre(equipo.getNombre());
			session.insert("EquipoMap.insertarEquipo", nuevoEquipo);
			session.commit();
			System.out.println("Se inserto un nuevo equipo");
			
		} catch(Exception ex) {
			ex.printStackTrace();
			session.rollback();
		} finally {
			session.close();
		}
		
	}
	
	public List<EquipoBean> listaEquipos() {
		
		List<EquipoBean> listaEquipos = null;
		
		try {
			session = MybatisUtils.getSqlSessionFactory().openSession();
			EquiposResult equiposResult = new EquiposResult();
			session.selectOne("EquipoMap.listaEquipos", equiposResult);
			listaEquipos = equiposResult.getEquiposResult();
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			session.close();
		}
		
		return listaEquipos;
	}

}
