package com.predictor.bot.obtenerpartidos.serializarliga;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.predictor.bot.interfaces.ISerializarLiga;
import com.predictor.bot.obtenerpartidos.entidad.TemporadasLiga;

public class SerializarLiga implements ISerializarLiga {
	
	public void serializarLiga(TemporadasLiga datosLiga) {
		
		try {
			System.out.println("serializando objeto..........");
			FileOutputStream fileOut = new FileOutputStream("C:\\Users\\rodri\\Documents\\PredictorDeportivo\\ligas-serializadas\\premier-league-2000-2019.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(datosLiga);
			out.close();
	        fileOut.close();
	        System.out.println("el objeto se serializo con exito.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public TemporadasLiga deserializarLiga(String nombreArchivo) {
		
		try {
			
			System.out.println("deserializando objeto.........");
			String rutaArchivo = "C:\\Users\\rodri\\Documents\\PredictorDeportivo\\ligas-serializadas\\" + nombreArchivo;
			FileInputStream fileIn = new FileInputStream(rutaArchivo);
			ObjectInputStream in = new ObjectInputStream(fileIn);
			TemporadasLiga datosLiga = (TemporadasLiga) in.readObject();
			in.close();
	        fileIn.close();
	        System.out.println("El objeto se deserializo con exito");
			return datosLiga;
			
		} catch (IOException i) {
			
			i.printStackTrace();
			return null;
			
		} catch (ClassNotFoundException c) {
			
	        System.out.println("Clase no encontrada");
	        c.printStackTrace();
	        return null;
	        
	    }

	}


}
