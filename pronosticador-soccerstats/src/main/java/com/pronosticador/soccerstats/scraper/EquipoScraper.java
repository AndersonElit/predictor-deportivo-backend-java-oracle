package com.pronosticador.soccerstats.scraper;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.pronosticador.soccerstats.beans.EquiposBean;

@SuppressWarnings("serial")
public class EquipoScraper implements Serializable {
	
	public static EquiposBean listaEquipos(String ligaUrl) {
		
		String url = "https://www.soccerstats.com/widetable.asp?league=" + ligaUrl;
		EquiposBean equipos = new EquiposBean();
		List<String> listaEquipos = new ArrayList<String>();
		
		try {
			Document doc = Jsoup.connect(url).get();
			Elements trs = doc.select("tr.trow8");
			int size = trs.size();
			equipos.setNumeroEquipos(size);
			int partidosJugados = Integer.parseInt(trs.get(0).select("td").get(2).text());
			equipos.setPartidosJugados(partidosJugados);
			for(Element tr: trs) {
				Element td = tr.select("td").get(1);
				Element a = td.selectFirst("a");
				String equipo = a.text();
				listaEquipos.add(equipo);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		equipos.setEquipos(listaEquipos);
		return equipos;
	}

}
