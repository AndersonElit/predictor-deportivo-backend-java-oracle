package com.pronosticador.soccerstats.main;

import java.io.IOException;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.pronosticador.soccerstats.beans.EquipoBean;
import com.pronosticador.soccerstats.beans.PartidoBean;
import com.pronosticador.soccerstats.beans.TemporadaBean;
import com.pronosticador.soccerstats.interfaces.ITemporadaNegocio;
import com.pronosticador.soccerstats.negocio.TemporadaNegocio;
import com.pronosticador.soccerstats.scraper.TituloLigaScraper;

public class Main {

	public static void main(String[] args) {
		
		/*
		//obtener y serializar datos
		ITemporadaNegocio temporadaObj = new TemporadaNegocio();
		temporadaObj.obtenerDatosTemporada("england_2018");
		*/
		
		/*
		//deserializar temporada
		TemporadaBean temporada = temporadaObj.deSerializarTemporada("england_2018");
		
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
		
	}

}
