package com.pronosticador.soccerstats.scraper;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.pronosticador.soccerstats.beans.PartidoBean;
import com.pronosticador.soccerstats.beans.PartidosBean;
import com.pronosticador.soccerstats.selectors.PartidoSelector;

@SuppressWarnings("serial")
public class PartidoScraper implements Serializable {
	
	public static PartidosBean listaPartidos(String ligaUrl, int numeroEquipos, int partidosJugados) {
		
		String url = "https://www.soccerstats.com/results.asp?league=" + ligaUrl + "&pmtype=bydate";
		PartidosBean partidos = new PartidosBean();
		List<PartidoBean> listaPartidos = new ArrayList<PartidoBean>();
		
		try {
			Document doc = Jsoup.connect(url).get();
			listaPartidos = PartidoSelector.obtenerPartidos(doc, numeroEquipos, partidosJugados);
			int numeroPartidos = listaPartidos.size();
			partidos.setNumeroPartidos(numeroPartidos);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		partidos.setPartidos(listaPartidos);
		return partidos;
	}

}
