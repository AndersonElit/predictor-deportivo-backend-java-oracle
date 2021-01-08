package com.predictor.bot.obtenerpartidos.elementos;

import org.jsoup.nodes.Element;

import com.predictor.bot.interfaces.IObtenerPartido;
import com.predictor.bot.obtenerpartidos.entidad.Partido;

public class ObtenerPartidoResultadosFutbol implements IObtenerPartido {
	
	public Partido datosPartido(Element tr) {
		
		Partido partido = new Partido();
		
		//Equipo local				
		Element tdLocal = tr.select("td.equipo1").first();
		String local = tdLocal.text();
		partido.setLocal(local);
		
		//Equipo visitante
		Element tdVisitante = tr.select("td.equipo2").first();
		String visitante = tdVisitante.text();
		partido.setVisitante(visitante);
		
		//resultado partido
		Element tdResultado = tr.select("td.rstd").first();
		Element aResultado = tdResultado.select("a.url").first();
		String resultado = aResultado.text();
		String[] resultadoDiv = resultado.split("-");
		//goles equipo local
		int golesLocal = Integer.parseInt(resultadoDiv[0]);
		partido.setGolesLocal(golesLocal);
		//goles equipo visitante
		int golesVisitante = Integer.parseInt(resultadoDiv[1]);
		partido.setGolesVisitante(golesVisitante);		
		
		return partido;
	}

}
