package com.pronosticador.soccerstats.serializar;

import java.io.File;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;

public class Serializar {
	
	public static String convertirObjAXml(Object objeto) {
		
		String xmlString = null;
		
		try {
			StringWriter sw = new StringWriter();
			JAXBContext jaxbContext = JAXBContext.newInstance(objeto.getClass());
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			jaxbMarshaller.marshal(objeto, sw);
			xmlString = sw.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return xmlString;
	}
	
	public static List<String> listaArchivosXml() {
		
		List<String> urls = new ArrayList<String>(); 
		
		try {
			Scanner input = new Scanner(new File("C:\\Users\\rodri\\Documents\\PredictorDeportivo\\temporadas_recuperadas.txt"));
			
			while (input.hasNextLine()) {
				String line = input.nextLine();
                urls.add(line);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		List<String> listaArchivos = new ArrayList<String>();
		
		for (String url : urls) {
			String nombreArchivo = url + ".xml";
			String rutaArchivo = "C:\\Users\\rodri\\Documents\\PredictorDeportivo\\temporadas-serializadas\\" + nombreArchivo;
			
			try {
				 File file = new File(rutaArchivo);
				 DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
				 DocumentBuilder db = dbf.newDocumentBuilder();
				 Document doc = db.parse(file);
				 listaArchivos.add(nombreArchivo);
			} catch (Exception e) {
				//System.out.println("El archivo: "+nombreArchivo+" no existe.");
			}
		}
		
		LinkedHashSet<String> hashSet = new LinkedHashSet<String>(listaArchivos);
		ArrayList<String> listaArchivosSinDuplicar = new ArrayList<String>(hashSet);
		return  listaArchivosSinDuplicar;
	}
	
	public static String extraerXmlTexto(String nombreArchivo) {
		
		String ruta = "C:\\Users\\rodri\\Documents\\PredictorDeportivo\\temporadas-serializadas\\" + nombreArchivo;
		String xmlTexto = null;
		
		try {
			
			File file = new File(ruta);
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(file);
			DOMSource domSource = new DOMSource(doc);
			StringWriter writer = new StringWriter();
			StreamResult result = new StreamResult(writer);
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer transformer = tf.newTransformer();
			transformer.transform(domSource, result);
			xmlTexto = writer.toString();
		} catch (Exception e) {
			System.out.println("error al cargar el archivo " + nombreArchivo);
		}
		
		return xmlTexto;
	}

}
