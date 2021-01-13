package com.pronosticador.soccerstats.equiposcoinciden;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.pronosticador.soccerstats.beans.EquipoBean;
import com.pronosticador.soccerstats.beans.PartidoBean;

@SuppressWarnings("serial")
public class EquiposCoinciden implements Serializable {
	
	public static int verificarEquipos(List<EquipoBean> equipos, List<PartidoBean> partidos, int temporada) {
		
		List<String> listaEquipos = new ArrayList<String>();
		int noCoinciden = 0;
		
		for (EquipoBean equipo : equipos) {
			String nombreEquipo = equipo.getEquipo();
			listaEquipos.add(nombreEquipo);
		}
		
		for (PartidoBean partido : partidos) {
			
			String local = partido.getLocal();
			String visitante = partido.getVisitante();
			
			boolean localExiste = listaEquipos.contains(local);
			boolean visitanteExiste = listaEquipos.contains(visitante);
			
			if (!localExiste) {
				noCoinciden++;
			}
			
			if (!visitanteExiste) {
				noCoinciden++;
			}
			
		}
		
		return noCoinciden;
		
	}

}
