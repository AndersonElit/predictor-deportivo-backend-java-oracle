package com.pronosticador.soccerstats.selectors;

import com.pronosticador.soccerstats.interfaces.ISelector;

public class PartidosFabrica {
	
	public ISelector obtenerSelector(String selector) {
		
		if (selector == "metodo1") {
			return new PartidoSel1();
		} else if (selector == "metodo2") {
			return new PartidoSel2();
		} else {
			return null;
		}
		
	}

}
