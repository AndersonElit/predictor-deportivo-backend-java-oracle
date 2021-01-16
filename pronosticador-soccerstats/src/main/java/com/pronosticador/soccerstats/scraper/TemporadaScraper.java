package com.pronosticador.soccerstats.scraper;

import com.pronosticador.soccerstats.beans.EquiposBean;
import com.pronosticador.soccerstats.beans.PartidosBean;
import com.pronosticador.soccerstats.beans.TemporadaBean;
import com.pronosticador.soccerstats.crearxml.CrearXml;
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
		int numeroEquipos = equiposObj.getNumeroEquipos();
		int partidosJugados = equiposObj.getPartidosJugados();
		
		//obtener partidos
		PartidosBean partidosObj = PartidoScraper.listaPartidos(ligaUrl, numeroEquipos, partidosJugados);
		temporada.setPartidos(partidosObj);
		
		int numeroPartidos = partidosObj.getNumeroPartidos();
		
		if (numeroPartidos == 0) {
			System.out.println("No se recuperaron los partidos para la temporada " + ligaUrl + ".");
		} else {
			System.out.println("Liga: " + liga);
			System.out.println("Numero equipos: " + numeroEquipos + ", partidos jugados: " + partidosJugados);
			System.out.println("Total partidos: " + numeroPartidos);
			String xmlText = Serializar.convertirObjAXml(temporada);
			CrearXml.crearXml(xmlText, ligaUrl);
		}
		
		
	}

}
