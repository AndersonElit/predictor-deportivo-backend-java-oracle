package com.predictor.bot.obtenerequipos.equiposcoinciden;

import java.io.Serializable;
import java.util.List;

import com.predictor.bot.interfaces.IEquiposCoinciden;
import com.predictor.bot.obtenerpartidos.entidad.Partido;
import com.predictor.bot.obtenerpartidos.entidad.PartidosPorFecha;

public class EquiposCoinciden implements IEquiposCoinciden, Serializable {
	
	private static final long serialVersionUID = 1L;

	public void compararEquipos(List<PartidosPorFecha> listaFechas, List<String> listaEequipos, int temporada) {
		
		for (PartidosPorFecha partidosFecha : listaFechas) {
			
			int fecha = partidosFecha.getFecha();
			List<Partido> partidos = partidosFecha.getPartidos();
			
			for (Partido partido : partidos) {
				
				String local = partido.getLocal();
				String visitante = partido.getVisitante();
				
				boolean localExiste = listaEequipos.contains(local);
				boolean visitanteExiste = listaEequipos.contains(visitante);
				
				if (!localExiste) {
					System.out.println("no coincide: " + local + " fecha: " + fecha + " temporada: " + temporada);
				}
				
				if (!visitanteExiste) {
					System.out.println("no coincide: " + visitante + " fecha: " + fecha + " temporada: " + temporada);
				}
				
			}
			
		}		
		
	}

}
