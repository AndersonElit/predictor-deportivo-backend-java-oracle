package com.pronosticador.soccerstats.serializar;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.pronosticador.soccerstats.beans.TemporadaBean;

public class Serializar {
	
	public static void serializarTemporada(TemporadaBean temporada, String ligaUrl) {
		
		try {
			String filePath = "C:\\Users\\rodri\\Documents\\PredictorDeportivo\\ligas-serializadas\\" + ligaUrl + ".ser";
			FileOutputStream fileOut = new FileOutputStream(filePath);
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(temporada);
			out.close();
	        fileOut.close();
	        System.out.println("el objeto se serializo con exito.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static TemporadaBean deSerializarTemporada(String ligaUrl) {
		
		
		try {
			String rutaArchivo = "C:\\Users\\rodri\\Documents\\PredictorDeportivo\\ligas-serializadas\\" + ligaUrl + ".ser";
			FileInputStream fileIn = new FileInputStream(rutaArchivo);
			ObjectInputStream in = new ObjectInputStream(fileIn);
			TemporadaBean temporada = (TemporadaBean) in.readObject();
			in.close();
	        fileIn.close();
	        System.out.println("El objeto se deserializo con exito");
	        return temporada;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		} catch (ClassNotFoundException c) {
			System.out.println("Clase no encontrada");
	        c.printStackTrace();
	        return null;
		}
		
	}

}
