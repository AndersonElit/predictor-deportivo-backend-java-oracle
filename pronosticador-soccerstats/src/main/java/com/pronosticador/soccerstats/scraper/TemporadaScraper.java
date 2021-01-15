package com.pronosticador.soccerstats.scraper;

import com.pronosticador.soccerstats.beans.EquiposBean;
import com.pronosticador.soccerstats.beans.PartidosBean;
import com.pronosticador.soccerstats.beans.TemporadaBean;
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
		
		//obtener nombre de la liga
		String liga = TituloLigaScraper.tituloLiga(ligaUrl);
		temporada.setLiga(liga);
		
		//obtener equipos
		EquiposBean equiposObj = EquipoScraper.listaEquipos(ligaUrl);
		temporada.setEquipos(equiposObj);
		
		//obtener partidos
		PartidosBean partidosObj = PartidoScraper.listaPartidos(ligaUrl);
		temporada.setPartidos(partidosObj);
		
		//validar integridad informacion
		//List<EquipoBean> equipos = equiposObj.getEquipos();
		//List<PartidoBean> partidos = partidosObj.getPartidos();
		
		/*
		int noCoinciden = EquiposCoinciden.verificarEquipos(equipos, partidos, temp);
		
		if (noCoinciden == 0) {
			Serializar.serializarTemporada(temporada, ligaUrl);
			System.out.println("Los datos de la liga " + pais + " " + temp + " fueron recuperados de forma exitosa.");
		} else {
			System.out.println(noCoinciden + " registros no coinciden para la liga " + pais + " " + temp);
		}
		*/
		
		int numeroPartidos = partidosObj.getNumeroPartidos();
		
		if (numeroPartidos == 0) {
			System.out.println("no se recuperaron los partidos para la temporada " + ligaUrl);
		} else {
			Serializar.serializarTemporada(temporada, ligaUrl);
			System.out.println("Los datos de la liga " + pais + " " + temp + " fueron recuperados de forma exitosa.");
		}
		
	}

}
