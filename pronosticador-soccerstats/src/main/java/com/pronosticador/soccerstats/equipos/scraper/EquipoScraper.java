package com.pronosticador.soccerstats.equipos.scraper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.pronosticador.soccerstats.equipos.beans.EquiposBean;

public class EquipoScraper {
	
	public static EquiposBean listaEquipos(String ligaUrl) {
		
		String url = "https://www.soccerstats.com/widetable.asp?league=" + ligaUrl;
		EquiposBean equipos = new EquiposBean();
		List<String> listaEquipos = new ArrayList<String>();
		
		try {
			Document doc = Jsoup.connect(url).get();
			Elements trs = doc.select("tr.trow8");
			int size = trs.size();
			equipos.setNumeroEquipos(size);
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
