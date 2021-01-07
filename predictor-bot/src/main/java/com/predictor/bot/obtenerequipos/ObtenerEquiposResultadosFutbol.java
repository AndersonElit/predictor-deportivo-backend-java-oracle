package com.predictor.bot.obtenerequipos;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.List;

import com.predictor.bot.obtenerequipos.entidad.ResultadoEquipos;
import com.predictor.bot.obtenerequipos.inter.IObtenerEquipos;

public class ObtenerEquiposResultadosFutbol implements IObtenerEquipos {
	
	private String baseUrl = "https://www.resultados-futbol.com/";
	private String url = "";

	public ResultadoEquipos listaEquipos(String liga, int temporada) {
		
		ResultadoEquipos resultado = new ResultadoEquipos();
		
		//armar url
		url = baseUrl + liga + temporada;
		List<String> equipos;
		
		try {
			Document doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return resultado;
	}

}
