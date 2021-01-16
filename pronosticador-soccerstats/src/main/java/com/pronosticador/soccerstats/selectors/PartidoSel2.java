package com.pronosticador.soccerstats.selectors;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.pronosticador.soccerstats.beans.PartidoBean;
import com.pronosticador.soccerstats.interfaces.ISelector;

public class PartidoSel2 implements ISelector {

	public List<PartidoBean> obtenerPartidos(Elements trs) {
		
		List<PartidoBean> partidos = new ArrayList<PartidoBean>();
		
		for (Element tr: trs) {
			
			int tds = tr.select("td").size();
			PartidoBean partido = new PartidoBean();
			
			if (tds == 9) {
				try {
					String local = tr.select("td").get(1).text();
					String visitante = tr.select("td").get(3).text();
					String marcador = tr.select("td").get(2).text();
					String[] marcadorDiv = marcador.split(" - ");
					int golesLocal = Integer.parseInt(marcadorDiv[0]);
					int golesVisitante = Integer.parseInt(marcadorDiv[1]);
					partido.setLocal(local);
					partido.setVisitante(visitante);
					partido.setGolesLocal(golesLocal);
					partido.setGolesVisitante(golesVisitante);
					partidos.add(partido);					
				} catch(NumberFormatException n) {
					System.out.println("error al extraer los datos metodo 2.");
				}
				
			}
			
		}
		
		return partidos;
	}
	
}
