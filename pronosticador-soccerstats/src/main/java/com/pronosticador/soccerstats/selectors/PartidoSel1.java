package com.pronosticador.soccerstats.selectors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.pronosticador.soccerstats.beans.PartidoBean;
import com.pronosticador.soccerstats.interfaces.ISelector;

public class PartidoSel1 implements ISelector {
	
	public List<PartidoBean> obtenerPartidos(Elements trs) {
		
		List<PartidoBean> partidos = new ArrayList<PartidoBean>();
		
		for (Element tr: trs) {
			
			int sizeTr = tr.select("td").size();
			PartidoBean partido = new PartidoBean();
			
			if ( sizeTr >= 4 ) {
				
				try {
					
					String equipos = tr.select("td").get(2).text();
					String[] equiposDiv = equipos.split(" - ");
					String local = equiposDiv[0];
					String visitante = equiposDiv[1];
					String marcador = tr.select("td").get(3).selectFirst("b").text();
					String[] marcadorDiv = marcador.split(" - ");
					int golesLocal = Integer.parseInt(marcadorDiv[0]);
					int golesVisitante = Integer.parseInt(marcadorDiv[1]);
					partido.setLocal(local);
					partido.setVisitante(visitante);
					partido.setGolesLocal(golesLocal);
					partido.setGolesVisitante(golesVisitante);
					partidos.add(partido);
					
				} catch (NullPointerException n) {
					System.out.println("error al extraer los datos metodo 1.");
				}
	
			}
			
		}
		
		Collections.reverse(partidos);
		return partidos;
	}

}
