package com.predictor.bot.obtenerpartidos.elementos;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.predictor.bot.interfaces.IObtenerPartido;
import com.predictor.bot.interfaces.IPartidosPorFecha;
import com.predictor.bot.obtenerpartidos.entidad.Partido;
import com.predictor.bot.obtenerpartidos.entidad.PartidosPorFecha;

public class PartidosPorFechaResultadosFutbol implements IPartidosPorFecha, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String baseUrl = "https://www.resultados-futbol.com/";
	private String url = "";
	
	public PartidosPorFecha listaPartidos(String ligaUrl, int temporada, int jornada) {
		
		PartidosPorFecha partidosPorFecha = new PartidosPorFecha();
		
		url = baseUrl + ligaUrl + temporada + "/grupo1/jornada" + jornada;
		
		List<Partido> partidos = new ArrayList<Partido>();
		
		try {
			Document doc = Jsoup.connect(url).get();
			Elements trsPartidos = doc.select("tr.vevent");
			
			for (Element tr :  trsPartidos) {
				IObtenerPartido obtenerPartido = new ObtenerPartidoResultadosFutbol();
				Partido partido = obtenerPartido.datosPartido(tr);
				partidos.add(partido);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		partidosPorFecha.setFecha(jornada);
		partidosPorFecha.setPartidos(partidos);
		
		return partidosPorFecha;
		
	}

}
