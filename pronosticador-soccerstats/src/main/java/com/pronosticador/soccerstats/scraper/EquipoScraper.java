package com.pronosticador.soccerstats.scraper;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.pronosticador.soccerstats.beans.EquipoBean;
import com.pronosticador.soccerstats.beans.EquiposBean;

@SuppressWarnings("serial")
public class EquipoScraper implements Serializable {
	
	public static EquiposBean listaEquipos(String ligaUrl) {
		
		String url = "https://www.soccerstats.com/widetable.asp?league=" + ligaUrl;
		EquiposBean equipos = new EquiposBean();
		List<EquipoBean> listaEquipos = new ArrayList<EquipoBean>();
		
		try {
			Document doc = Jsoup.connect(url).get();
			Elements trs = doc.select("tr.trow8");
			int size = trs.size();
			equipos.setNumeroEquipos(size);
			for(Element tr: trs) {
				Element td = tr.select("td").get(1);
				Element a = td.selectFirst("a");
				String nombreEquipo = a.text();
				EquipoBean equipo = new EquipoBean();
				equipo.setEquipo(nombreEquipo);
				listaEquipos.add(equipo);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		equipos.setEquipos(listaEquipos);
		return equipos;
	}

}
