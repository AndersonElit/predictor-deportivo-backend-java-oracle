package com.pronosticador.soccerstats.interfaces;

import java.util.List;

import org.jsoup.select.Elements;

import com.pronosticador.soccerstats.beans.PartidoBean;

public interface ISelector {
	
	public List<PartidoBean> obtenerPartidos(Elements trs);

}
