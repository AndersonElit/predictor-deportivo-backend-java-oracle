package com.pronosticador.soccerstats.scraper;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class TituloLigaScraper {
	
	public static String tituloLiga(String ligaUrl) {
		
		String url = "https://www.soccerstats.com/latest.asp?league=" + ligaUrl;
		String nombreLiga = null;
		
		try {
			Document doc = Jsoup.connect(url).get();
			Element h1 = doc.selectFirst("h1");
			nombreLiga = h1.text();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return nombreLiga;
	}

}
