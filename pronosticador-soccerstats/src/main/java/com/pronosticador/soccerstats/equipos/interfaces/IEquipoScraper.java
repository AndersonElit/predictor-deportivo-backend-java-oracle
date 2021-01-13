package com.pronosticador.soccerstats.equipos.interfaces;

import com.pronosticador.soccerstats.equipos.beans.EquiposBean;

public interface IEquipoScraper {
	
	public EquiposBean listaequipos(String ligaUrl);

}
