package com.predictor.bot.tests;

import java.io.IOException;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.predictor.bot.interfaces.IObtenerEquipos;
import com.predictor.bot.interfaces.IPartidosPorFecha;
import com.predictor.bot.obtenerequipos.composition.ObtenerEquiposResultadosFutbol;
import com.predictor.bot.obtenerequipos.entidad.ResultadoEquipos;
import com.predictor.bot.obtenerpartidos.elementos.PartidosPorFechaResultadosFutbol;
import com.predictor.bot.obtenerpartidos.entidad.Partido;
import com.predictor.bot.obtenerpartidos.entidad.PartidosPorFecha;

public class Tester {

	public static void main(String[] args) {
		
		/*
		//obtener lista de equipos
				
		IObtenerEquipos equiposObj = new ObtenerEquiposResultadosFutbol();
		ResultadoEquipos equipos = equiposObj.listaEquipos("premier", 2019);
		List<String> listaEquipos = equipos.getEquipos();
		
		for (String equipo : listaEquipos) {
			System.out.println(equipo);
		}
		
		System.out.println(equipos.getNumeroEquipos());
		*/
		
		//------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		/*
		//Ejemplo lista partidos para una fecha dada
		
		IPartidosPorFecha partidosPorFecha = new PartidosPorFechaResultadosFutbol();
		PartidosPorFecha partidosObj = partidosPorFecha.listaPartidos("premier", 2019, 1);
		List<Partido> partidos = partidosObj.getPartidos();
		
		for (Partido partido : partidos) {
			String local = partido.getLocal();
			String visitante = partido.getVisitante();
			int golesLocal = partido.getGolesLocal();
			int golesVisitante = partido.getGolesVisitante();
			System.out.println("Local: " + local + ", " + "Visitante: " + visitante + ", " + "Goles local: " + golesLocal + ", " + "Goles visitante: " + golesVisitante);
		}
		*/
		
		//------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		//obtener datos para una temporada en especifico
		
		
		

	}

}
