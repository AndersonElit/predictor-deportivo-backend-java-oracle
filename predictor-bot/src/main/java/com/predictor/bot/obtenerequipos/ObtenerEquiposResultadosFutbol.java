package com.predictor.bot.obtenerequipos;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.predictor.bot.obtenerequipos.entidad.ResultadoEquipos;
import com.predictor.bot.obtenerequipos.inter.IObtenerEquipos;

public class ObtenerEquiposResultadosFutbol implements IObtenerEquipos {
	
	private String baseUrl = "https://www.resultados-futbol.com/";
	private String url = "";

	public ResultadoEquipos listaEquipos(String pais, String liga, String ligaUrl, int temporada, int categoria) {
		
		ResultadoEquipos resultado = new ResultadoEquipos();
		
		//armar url
		url = baseUrl + ligaUrl + temporada;
		List<String> listaEequipos = new ArrayList<String>();
		
		try {
			Document doc = Jsoup.connect(url).get();
			Elements equipos = doc.select("td.equipo");
			for (Element equipo : equipos) {
				String equipoText = equipo.text();
				listaEequipos.add(equipoText);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		resultado.setPais(pais);
		resultado.setLiga(liga);
		resultado.setEquipos(listaEequipos);
		resultado.setCategoria(categoria);
		resultado.setNumeroEquipos(listaEequipos.size());
		
		return resultado;
	}

}
