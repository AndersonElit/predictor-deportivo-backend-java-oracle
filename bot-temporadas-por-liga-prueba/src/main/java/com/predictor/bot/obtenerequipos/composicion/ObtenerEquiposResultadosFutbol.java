package com.predictor.bot.obtenerequipos.composicion;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.predictor.bot.interfaces.IObtenerEquipos;
import com.predictor.bot.obtenerequipos.entidad.ResultadoEquipos;

public class ObtenerEquiposResultadosFutbol implements IObtenerEquipos, Serializable {
	
	private static final long serialVersionUID = 1L;
	private String baseUrl = "https://www.resultados-futbol.com/";
	private String url = "";

	public ResultadoEquipos listaEquipos(String ligaUrl, int temporada) {
		
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
			//String mensaje = e.getMessage();
			//System.out.println(mensaje);
		}
		
		resultado.setEquipos(listaEequipos);
		resultado.setNumeroEquipos(listaEequipos.size());
		
		return resultado;
	}

}
