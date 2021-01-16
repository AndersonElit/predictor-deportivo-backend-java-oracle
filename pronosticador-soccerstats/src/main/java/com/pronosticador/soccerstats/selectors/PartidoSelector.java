package com.pronosticador.soccerstats.selectors;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.pronosticador.soccerstats.beans.PartidoBean;
import com.pronosticador.soccerstats.interfaces.ISelector;

public class PartidoSelector {
	
	public static List<PartidoBean> obtenerPartidos(Document doc, int numeroEquipos, int partidosJugados) {
		
		List<PartidoBean> partidos = new ArrayList<PartidoBean>();
		int numeroPartidos = (int) (numeroEquipos/2)*partidosJugados;
		PartidosFabrica partidosFab = new PartidosFabrica();
		
		//metodo 1
		Elements trs1 = doc.select("tr.trow3");
		int size1 = trs1.size();
		Elements trs2 = doc.select("tr.odd");
		int size2 = trs2.size();
		Elements trs3 = doc.select("tr[bgcolor=#f0f0f0]");
		int size3 = trs3.size();
		
		if (size1 >= numeroPartidos) {
			ISelector partidosObj = partidosFab.obtenerSelector("metodo1");
			partidos = partidosObj.obtenerPartidos(trs1);
		} else if (size2 >= numeroPartidos) {
			ISelector partidosObj = partidosFab.obtenerSelector("metodo1");
			partidos = partidosObj.obtenerPartidos(trs2);
		} else if (size3 >= numeroPartidos) {
			ISelector partidosObj = partidosFab.obtenerSelector("metodo2");
			partidos = partidosObj.obtenerPartidos(trs3);
		}
		
		return partidos;
	}

}
