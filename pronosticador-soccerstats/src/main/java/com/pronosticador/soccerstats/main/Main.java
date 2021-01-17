package com.pronosticador.soccerstats.main;

import java.io.File;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;

import com.pronosticador.soccerstats.interfaces.ITemporadaNegocio;
import com.pronosticador.soccerstats.negocio.TemporadaNegocio;
import com.pronosticador.soccerstats.serializar.Serializar;

public class Main {

	public static void main(String[] args) {
		
		/*
		
		//Obtener datos temporadas
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
		*/
		
		//List<String> listaArchivos = new ArrayList<String>();
		
		/*
		try {
			
			 File file = new File("C:\\Users\\rodri\\Documents\\PredictorDeportivo\\temporadas-serializadas\\brazil_2016.xml");
			 DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			 DocumentBuilder db = dbf.newDocumentBuilder();
			 Document doc = db.parse(file);
			 DOMSource domSource = new DOMSource(doc);
			 StringWriter writer = new StringWriter();
			 StreamResult result = new StreamResult(writer);
			 TransformerFactory tf = TransformerFactory.newInstance();
			 Transformer transformer = tf.newTransformer();
			 transformer.transform(domSource, result);
			 System.out.println(writer.toString());
			 
		} catch (Exception e) {
			System.out.println("error al cargar el archivo.");
		}
		*/
		
		/*
		//Obtener lista archivos xml
		
		ITemporadaNegocio temporadaObj = new TemporadaNegocio();
		List<String> listaArchivosXml = temporadaObj.listaArchivosXml();
		System.out.println("Numero de archivos: " + listaArchivosXml.size());
		*/
		
		/*
		//extraer xml string
		
		ITemporadaNegocio temporadaObj = new TemporadaNegocio();
		String xmlTexto = temporadaObj.extraerXmlTexto("brazil_2019.xml");
		System.out.println(xmlTexto);
		*/
		
	}

}
