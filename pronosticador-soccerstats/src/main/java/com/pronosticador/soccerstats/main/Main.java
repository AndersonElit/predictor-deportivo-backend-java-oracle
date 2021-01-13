package com.pronosticador.soccerstats.main;

import java.io.IOException;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.pronosticador.soccerstats.equipos.beans.EquiposBean;
import com.pronosticador.soccerstats.equipos.scraper.EquipoScraper;

public class Main {

	public static void main(String[] args) {
		
		/*
		EquiposBean equipoObj = EquipoScraper.listaEquipos("england_2018");
		
		int numeroEquipos = equipoObj.getNumeroEquipos();
		System.out.println("Numero de equipos: " + numeroEquipos);
		
		List<String> equipos = equipoObj.getEquipos();
		
		for (String equipo: equipos) {
			System.out.println(equipo);
		}
		*/
		
		/*
		String url = "https://www.soccerstats.com/results.asp?league=england_2018&pmtype=bydate";
		
		try {
			Document doc = Jsoup.connect(url).get();
			Elements trs = doc.select("tr.trow3");
			int size = trs.size();
			System.out.println("Tamaño: " + size);
			for (Element tr: trs) {
				Element td1 = tr.select("td").get(2);
				String equipos = td1.text();
				String[] equiposDiv = equipos.split(" - ");
				String local = equiposDiv[0];
				String visitante = equiposDiv[1];
				Element td2 = tr.select("td").get(3);
				Element b = td2.selectFirst("b");
				String marcador = b.text();
				String[] marcadorDiv = marcador.split(" - ");
				int golesLocal = Integer.parseInt(marcadorDiv[0]);
				int golesVisitante = Integer.parseInt(marcadorDiv[1]);
				System.out.println("Local: " + local + ", Visitante: " + visitante + ", goles local: " + golesLocal + ", goles visitante: " + golesVisitante);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/

	}

}
