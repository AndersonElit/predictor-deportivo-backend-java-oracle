package com.pronosticador.soccerstats.serializar;

import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

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

}
