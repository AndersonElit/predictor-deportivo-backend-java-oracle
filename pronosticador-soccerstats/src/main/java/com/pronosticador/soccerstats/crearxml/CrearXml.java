package com.pronosticador.soccerstats.crearxml;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;


public class CrearXml {
	
	public static void crearXml(String textoXml, String ligaUrl) {
		
		
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			factory.setNamespaceAware(true);
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(new InputSource(new StringReader(textoXml)));
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			String ruta = "C:\\Users\\rodri\\Documents\\PredictorDeportivo\\temporadas-serializadas\\" + ligaUrl + ".xml";
			StreamResult result = new StreamResult(new File(ruta));
			transformer.transform(source, result);
			System.out.println("El archivo xml se creo y guardo de forma exitosa.");
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerException tfe) {
		      tfe.printStackTrace();
	    } catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
