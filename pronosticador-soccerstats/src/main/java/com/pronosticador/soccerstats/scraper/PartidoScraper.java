package com.pronosticador.soccerstats.scraper;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.pronosticador.soccerstats.beans.PartidoBean;
import com.pronosticador.soccerstats.beans.PartidosBean;

@SuppressWarnings("serial")
public class PartidoScraper implements Serializable {
	
	public static PartidosBean listaPartidos(String ligaUrl) {
		
		String url = "https://www.soccerstats.com/results.asp?league=" + ligaUrl + "&pmtype=bydate";
		PartidosBean partidos = new PartidosBean();
		List<PartidoBean> listaPartidos = new ArrayList<PartidoBean>();
		
		try {
			Document doc = Jsoup.connect(url).get();
			Elements trs = doc.select("tr.trow3");
			int size = trs.size();
			
			if (size == 0) {
				trs = doc.select("tr.odd");
			}
			
			size = trs.size();
			partidos.setNumeroPartidos(size);
			
			for (Element tr: trs) {
				
				int sizeTr = tr.select("td").size();
				PartidoBean partido = new PartidoBean();
				
				if ( sizeTr >= 4 ) {
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
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Collections.reverse(listaPartidos);
		partidos.setPartidos(listaPartidos);
		return partidos;
	}

}
