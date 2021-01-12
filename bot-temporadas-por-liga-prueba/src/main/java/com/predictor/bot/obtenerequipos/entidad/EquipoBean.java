package com.predictor.bot.obtenerequipos.entidad;

import java.io.Serializable;
import javax.xml.bind.annotation.*;

@XmlRootElement(name = "equipo")
public class EquipoBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String nombre;
	
	public EquipoBean() {
		
	}
	
	public EquipoBean(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	
	public EquipoBean(String nombre) {
		this.nombre = nombre;
	}
	
	public int getId() {
		return id;
	}
	
	@XmlElement
	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}
	
	@XmlElement
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
