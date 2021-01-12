package com.predictor.bot.obtenerequipos.serializar;

import java.io.StringWriter;
import java.util.List;

import javax.xml.bind.*;

import com.predictor.bot.obtenerequipos.entidad.EquipoBean;
import com.predictor.bot.obtenerequipos.entidad.EquiposResult;

public class SerializarEquipo {
	
	public String convertirAXml(EquipoBean equipo) {
		
		String xmlString = null;
		
		try {
			StringWriter sw = new StringWriter();
			JAXBContext jaxbContext = JAXBContext.newInstance(equipo.getClass());
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			jaxbMarshaller.marshal(equipo, sw);
			xmlString = sw.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return xmlString;
	}
	
	public String convertirArrayAXml(EquiposResult listaEquipos) {
		
		String xmlString = null;
		
		try {
			StringWriter sw = new StringWriter();
			JAXBContext jaxbContext = JAXBContext.newInstance(listaEquipos.getClass());
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			jaxbMarshaller.marshal(listaEquipos, sw);
			xmlString = sw.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return xmlString;
	}

}
