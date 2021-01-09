package com.predictor.bot.tests;

import java.io.IOException;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.predictor.bot.interfaces.IFechasTemporada;
import com.predictor.bot.interfaces.IObtenerEquipos;
import com.predictor.bot.interfaces.IPartidosPorFecha;
import com.predictor.bot.interfaces.ITotalDatos;
import com.predictor.bot.obtenerequipos.composition.ObtenerEquiposResultadosFutbol;
import com.predictor.bot.obtenerequipos.entidad.ResultadoEquipos;
import com.predictor.bot.obtenerpartidos.composition.DatosTotalesLiga;
import com.predictor.bot.obtenerpartidos.elementos.ListaPartidosResultadosFutbol;
import com.predictor.bot.obtenerpartidos.elementos.PartidosPorFechaResultadosFutbol;
import com.predictor.bot.obtenerpartidos.entidad.FechasTemporada;
import com.predictor.bot.obtenerpartidos.entidad.Partido;
import com.predictor.bot.obtenerpartidos.entidad.PartidosPorFecha;
import com.predictor.bot.obtenerpartidos.entidad.TemporadasLiga;

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
		
		/*
		//obtener datos para una temporada en especifico
		
		IFechasTemporada partidosTemporadaObj = new ListaPartidosResultadosFutbol();
		FechasTemporada partidosTemporada = partidosTemporadaObj.listaFechas("premier", 2019);
		
		int temporada = partidosTemporada.getTemporada();
		List<String> equipos = partidosTemporada.getEquiposObj().getEquipos();
		int numeroEquipos = partidosTemporada.getEquiposObj().getNumeroEquipos();
		List<PartidosPorFecha> listaFechas = partidosTemporada.getListaFechas();
		
		System.out.println("Temporada: " + temporada);
		
		System.out.println("Equipos:");
		
		for (String equipo : equipos) {
			System.out.println(equipo);
		}
		
		System.out.println("Numero de equipos: " + numeroEquipos);
		
		System.out.println("Partidos:");
		
		for (PartidosPorFecha partidosFecha : listaFechas) {
			
			int fecha = partidosFecha.getFecha();
			System.out.println("Fecha " + fecha);
			List<Partido> partidos = partidosFecha.getPartidos();
			
			for (Partido partido : partidos) {
				String local = partido.getLocal();
				String visitante = partido.getVisitante();
				int golesLocal = partido.getGolesLocal();
				int golesVisitante = partido.getGolesVisitante();
				System.out.println(local + "-" + visitante + " " + golesLocal + "-" + golesVisitante);
			}
			
		}
		*/
		
		//----------------------------------------------------------------------------------------------------------------------------------------------------
		
		/*
		//obtener todos los datos para una liga
		
		ITotalDatos datosLigasObj = new DatosTotalesLiga();
		TemporadasLiga datosLiga = datosLigasObj.listaTemporadas("Inglaterra", "Premier League", "premier", 1);
		
		String pais = datosLiga.getPais();
		String liga = datosLiga.getLiga();
		int categoria = datosLiga.getCategoria();
		
		System.out.println("Pais: " + pais);
		System.out.println("Liga: " + liga);
		System.out.println("Categoria: " + categoria);
		
		List<FechasTemporada> listaTemporadas = datosLiga.getListaTemporadas();
		
		for (FechasTemporada partidosTemporada : listaTemporadas) {
			
			int temporada = partidosTemporada.getTemporada();
			List<String> equipos = partidosTemporada.getEquiposObj().getEquipos();
			int numeroEquipos = partidosTemporada.getEquiposObj().getNumeroEquipos();
			List<PartidosPorFecha> listaFechas = partidosTemporada.getListaFechas();
			
			System.out.println("Temporada: " + temporada);
			
			System.out.println("Equipos:");
			
			for (String equipo : equipos) {
				System.out.println(equipo);
			}
			
			System.out.println("Numero de equipos: " + numeroEquipos);
			
			System.out.println("Partidos:");
			
			for (PartidosPorFecha partidosFecha : listaFechas) {
				
				int fecha = partidosFecha.getFecha();
				System.out.println("Fecha " + fecha);
				List<Partido> partidos = partidosFecha.getPartidos();
				
				for (Partido partido : partidos) {
					String local = partido.getLocal();
					String visitante = partido.getVisitante();
					int golesLocal = partido.getGolesLocal();
					int golesVisitante = partido.getGolesVisitante();
					System.out.println(local + "-" + visitante + " " + golesLocal + "-" + golesVisitante);
				}
				
			}
			
		}
		
		//----------------------------------------------------------------------------------------------------------------------------------------------------
		 */

	}

}
