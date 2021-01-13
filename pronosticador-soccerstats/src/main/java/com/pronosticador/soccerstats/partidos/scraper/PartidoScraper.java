package com.pronosticador.soccerstats.partidos.scraper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.pronosticador.soccerstats.partidos.beans.PartidoBean;
import com.pronosticador.soccerstats.partidos.beans.PartidosBean;

public class PartidoScraper {
	
	public static PartidosBean listaPartidos(String ligaUrl) {
		
		String url = "https://www.soccerstats.com/results.asp?league=" + ligaUrl + "&pmtype=bydate";
		PartidosBean partidos = new PartidosBean();
		List<PartidoBean> listaPartidos = new ArrayList<PartidoBean>();
		
		try {
			Document doc = Jsoup.connect(url).get();
			Elements trs = doc.select("tr.trow3");
			int size = trs.size();
			partidos.setNumeroPartidos(size);
			PartidoBean partido = new PartidoBean();
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
				partido.setLocal(local);
				partido.setVisitante(visitante);
				partido.setGolesLocal(golesLocal);
				partido.setGolesVisitante(golesVisitante);
				listaPartidos.add(partido);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		partidos.setPartidos(listaPartidos);
		return partidos;
	}

}
