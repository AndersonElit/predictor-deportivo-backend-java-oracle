package com.predictor.bot.tests;

import java.util.ArrayList;
import java.util.List;

import com.predictor.bot.interfaces.IEquipoService;
import com.predictor.bot.interfaces.IObtenerEquipos;
import com.predictor.bot.interfaces.IPartidosPorFecha;
import com.predictor.bot.interfaces.ISerializarLiga;
import com.predictor.bot.obtenerequipos.composicion.ObtenerEquiposResultadosFutbol;
import com.predictor.bot.obtenerequipos.entidad.EquipoBean;
import com.predictor.bot.obtenerequipos.entidad.EquiposResult;
import com.predictor.bot.obtenerequipos.entidad.ResultadoEquipos;
import com.predictor.bot.obtenerequipos.serializar.SerializarEquipo;
import com.predictor.bot.obtenerequipos.service.EquipoService;
import com.predictor.bot.obtenerpartidos.elementos.PartidosPorFechaResultadosFutbol;
import com.predictor.bot.obtenerpartidos.entidad.FechasTemporada;
import com.predictor.bot.obtenerpartidos.entidad.Partido;
import com.predictor.bot.obtenerpartidos.entidad.PartidosPorFecha;
import com.predictor.bot.obtenerpartidos.entidad.TemporadasLiga;
import com.predictor.bot.obtenerpartidos.serializarliga.SerializarLiga;

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
		//tener en cuenta como se accede a los datos de la liga desde una url
		
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
		//serializar liga
		ITotalDatos datosLigasObj = new DatosTotalesResultadosFutbol();
		TemporadasLiga datosLiga = datosLigasObj.listaTemporadas("Inglaterra", "Premier League", "premier", 1);
		ISerializarLiga serializarLiga = new SerializarLiga();
		serializarLiga.serializarLiga(datosLiga);
		*/
		
		//----------------------------------------------------------------------------------------------------------------------------------------------------
		
		/*
		//deserializar liga
		ISerializarLiga serializarLiga = new SerializarLiga();
		TemporadasLiga datosLiga = serializarLiga.deserializarLiga("premier-league-2000-2019.ser");	
		
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
			
			System.out.println("Equipos:" + equipos);
			
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
		*/		
		
		//-------------------------------------------------------------------------------------------------------------------------------------------------
		
		/*
		//Insertar equipo en base de datos prueba
		IEquipoService equipoService = new EquipoService();
		
		EquipoBean nuevoEquipo = new EquipoBean();
		
		nuevoEquipo.setId(6);
		nuevoEquipo.setNombre("Barcelona");
		
		equipoService.insertarEquipo(nuevoEquipo);
		*/
		
		/*
		//obtener lista de equipos base  de datos prueba
		IEquipoService equipoService = new EquipoService();
		
		List<EquipoBean> listaEquipos = equipoService.listaEquipos();
		
		for (EquipoBean equipo : listaEquipos) {
			int id = equipo.getId();
			String nombre = equipo.getNombre();
			System.out.println("Id: " + id + " Equipo: " + nombre);
		}
		*/
		
		/*		
		SerializarEquipo serializar = new SerializarEquipo();
		EquipoBean equipo = new EquipoBean();
		
		equipo.setId(1);
		equipo.setNombre("Bayern");
		
		String str = serializar.convertirAXml(equipo);
		
		System.out.println(str);
		*/
		
		SerializarEquipo serializar = new SerializarEquipo();
		EquiposResult equiposResult = new EquiposResult();
		List<EquipoBean> listaEquipos = new ArrayList<EquipoBean>();
		
		EquipoBean equipo = new EquipoBean();
		equipo.setId(1);
		equipo.setNombre("Barcelona");
		listaEquipos.add(equipo);
		
		EquipoBean equipo2 = new EquipoBean();		
		equipo2.setId(2);
		equipo2.setNombre("Real Madrid");
		listaEquipos.add(equipo2);
		
		EquipoBean equipo3 = new EquipoBean();
		equipo3.setId(3);
		equipo3.setNombre("Bayern");
		listaEquipos.add(equipo3);
		
		equiposResult.setEquiposResult(listaEquipos);
		
		String str = serializar.convertirArrayAXml(equiposResult);
		
		System.out.println(str);

	}

}
