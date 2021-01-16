package com.pronosticador.soccerstats.main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pronosticador.soccerstats.interfaces.ITemporadaNegocio;
import com.pronosticador.soccerstats.negocio.TemporadaNegocio;

public class Main {

	public static void main(String[] args) {
		
		List<String> urls = new ArrayList<String>(); 
		
		try {
			Scanner input = new Scanner(new File("C:\\Users\\rodri\\Documents\\PredictorDeportivo\\temporadas1.txt"));
			
			while (input.hasNextLine()) {
				String line = input.nextLine();
                urls.add(line);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for (String url : urls) {
			ITemporadaNegocio temporadaObj = new TemporadaNegocio();
			temporadaObj.obtenerDatosTemporada(url);
		}
		
	}

}
