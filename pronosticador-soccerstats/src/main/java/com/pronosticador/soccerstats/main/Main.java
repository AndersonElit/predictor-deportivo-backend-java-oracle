package com.pronosticador.soccerstats.main;

import java.io.IOException;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.pronosticador.soccerstats.beans.EquipoBean;
import com.pronosticador.soccerstats.beans.PartidoBean;
import com.pronosticador.soccerstats.beans.PartidosBean;
import com.pronosticador.soccerstats.beans.TemporadaBean;
import com.pronosticador.soccerstats.interfaces.ITemporadaNegocio;
import com.pronosticador.soccerstats.negocio.TemporadaNegocio;
import com.pronosticador.soccerstats.scraper.PartidoScraper;
import com.pronosticador.soccerstats.scraper.TituloLigaScraper;

public class Main {

	public static void main(String[] args) {
		
		/*
		//obtener y serializar datos
		ITemporadaNegocio temporadaObj = new TemporadaNegocio();
		temporadaObj.obtenerDatosTemporada("england10_2018");
		*/
				
		/*
		//deserializar temporada
		ITemporadaNegocio temporadaObj = new TemporadaNegocio();
		TemporadaBean temporada = temporadaObj.deSerializarTemporada("england10_2018");
		
		List<EquipoBean> equipos = temporada.getEquipos().getEquipos();		
		int numeroEquipos = temporada.getEquipos().getNumeroEquipos();
		System.out.println("Numero de equipos: " + numeroEquipos);
		
		for (EquipoBean equipo : equipos) {
			String nombreEquipo = equipo.getEquipo();
			System.out.println(nombreEquipo);
		}
		
		List<PartidoBean> partidos = temporada.getPartidos().getPartidos();
		int numeroPartidos = temporada.getPartidos().getNumeroPartidos();
		System.out.println("Numero de partidos: " + numeroPartidos);
		
		for (PartidoBean partido : partidos) {
			String local = partido.getLocal();
			String visitante = partido.getVisitante();
			int golesLocal = partido.getGolesLocal();
			int golesVisitante = partido.getGolesVisitante();
			System.out.println("Local: " + local + ", Visitante: " + visitante + ", golesLocal: " + golesLocal + ", golesVisitante: " + golesVisitante);
		}
		*/
		
		/*
		PartidosBean partidos = PartidoScraper.listaPartidos("australia_2018");
		int numeroPartidos = partidos.getNumeroPartidos();
		System.out.println("Numero de partidos: " + numeroPartidos);
		*/
		
		
		String url = "https://www.soccerstats.com/results.asp?league=austria_2019&pmtype=bydate";
		
		try {
			Document doc = Jsoup.connect(url).get();
			//Elements trs = doc.select("tr.odd");
			Elements trs = doc.select("tr[bgcolor=#f0f0f0]");
			//Elements trs = doc.select("tr.trow3");
			//int size = trs.size();
			//System.out.println("Longitud: " + size);
			for (Element tr: trs) {
				//String local = tr.select("td").get(2).text();
				int tds = tr.select("td").size();
				//System.out.println("longitud td: " + tds);
				if (tds == 9) {
					String local = tr.select("td").get(1).text();
					String visitante = tr.select("td").get(3).text();
					String marcador = tr.select("td").get(2).text();
					System.out.println("Local: " + local + ", visitante: " + visitante + ", marcador: " + marcador);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
