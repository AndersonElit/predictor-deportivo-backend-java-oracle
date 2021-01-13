package com.pronosticador.soccerstats.scraper;

import java.util.List;

import com.pronosticador.soccerstats.beans.EquipoBean;
import com.pronosticador.soccerstats.beans.EquiposBean;
import com.pronosticador.soccerstats.beans.PartidoBean;
import com.pronosticador.soccerstats.beans.PartidosBean;
import com.pronosticador.soccerstats.beans.TemporadaBean;
import com.pronosticador.soccerstats.equiposcoinciden.EquiposCoinciden;
import com.pronosticador.soccerstats.serializar.Serializar;

public class TemporadaScraper {
	
	public static void datosTemporada(String ligaUrl) {
		
		System.out.println("Obteniendo datos para " + ligaUrl + "..............");
		
		TemporadaBean temporada = new TemporadaBean();
		
		String[] ligaUrlDiv = ligaUrl.split("_");
		String pais = ligaUrlDiv[0];
		int temp = Integer.parseInt(ligaUrlDiv[1]);
		temporada.setPais(pais);
		temporada.setTemporada(temp);
		
		//obtener equipos
		EquiposBean equiposObj = EquipoScraper.listaEquipos(ligaUrl);
		temporada.setEquipos(equiposObj);
		
		//obtener partidos
		PartidosBean partidosObj = PartidoScraper.listaPartidos(ligaUrl);
		temporada.setPartidos(partidosObj);
		
		//validar integridad informacion
		List<EquipoBean> equipos = equiposObj.getEquipos();
		List<PartidoBean> partidos = partidosObj.getPartidos();
		int noCoinciden = EquiposCoinciden.verificarEquipos(equipos, partidos, temp);
		
		if (noCoinciden > 0) {
			System.out.println(noCoinciden + " registros no coinciden para la liga " + pais + " " + temp);
		} else {
			Serializar.serializarTemporada(temporada, ligaUrl);
			System.out.println("Los datos de la liga " + pais + " " + temp + " fueron recuperados de forma exitosa.");
		}
		
	}

}
