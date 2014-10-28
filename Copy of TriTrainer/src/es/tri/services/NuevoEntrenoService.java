package es.tri.services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import es.mybatis.MyBatisConnectionFactory;
import es.tri.dao.TriTEjerciciosMapper;
import es.tri.dao.TriTEntrenosMapper;
import es.tri.dao.TriTiEntrenoUsuarioMapper;
import es.tri.dao.model.TriTEjercicios;
import es.tri.dao.model.TriTEjerciciosExample;
import es.tri.dao.model.TriTEntrenos;
import es.tri.dao.model.TriTEntrenosExample;
import es.tri.dao.model.TriTiEntrenoUsuario;
import es.tri.dao.model.TriTiEntrenoUsuarioExample;

public class NuevoEntrenoService {
	
static final int mASprint=162;
static final int mMSprint=91;
static final int mpSprint=80;

static final int mAOlimpic=210;
static final int mMOlimpic=159;
static final int mpOlimpic=140;


static final int pAmateur=20;
static final int pMedio=10;
static final int pPro=0;
static final int DistNatSprintBase=1000;
static final int DistRunSprintBase=6000;
static final int DistCycleSprintBase=20000;
static final int DistSwimOlimpicBase=1500;
static final int DistRunOlimpicBase=10000;
static final int DistCycleOlimpicBase= 40000;



	public static Boolean tieneEntrenos(Integer idUser) {
		SqlSessionFactory sqlMapper = MyBatisConnectionFactory
				.getSqlSessionFactory();
		SqlSession sqlSession = sqlMapper.openSession();
		try {

			TriTiEntrenoUsuarioMapper mapper = sqlSession
					.getMapper(TriTiEntrenoUsuarioMapper.class);

			TriTiEntrenoUsuarioExample usuarioEntrenoExample = new TriTiEntrenoUsuarioExample();
			usuarioEntrenoExample.createCriteria().andId_usuarioEqualTo(idUser);
			usuarioEntrenoExample.createCriteria().andFecha_bajaIsNull();
			if (mapper.selectByExample(usuarioEntrenoExample).size() > 0)
				return true;
			else
				return false;
		} finally {
			sqlSession.close();
		}

	}
	
	public static int idEntreno(Integer idUser) {
		SqlSessionFactory sqlMapper = MyBatisConnectionFactory
				.getSqlSessionFactory();
		SqlSession sqlSession = sqlMapper.openSession();
		try {

			TriTiEntrenoUsuarioMapper mapper = sqlSession
					.getMapper(TriTiEntrenoUsuarioMapper.class);

			TriTiEntrenoUsuarioExample usuarioEntrenoExample = new TriTiEntrenoUsuarioExample();
			usuarioEntrenoExample.createCriteria().andId_usuarioEqualTo(idUser).andFecha_bajaIsNull();

			TriTiEntrenoUsuario entrenoUsuario = mapper.selectByExample(usuarioEntrenoExample).get(0);
			if (entrenoUsuario.getId_entreno() > 0)
				return entrenoUsuario.getId_entreno();
			else
				return 0;
		} finally {
			sqlSession.close();
		}

	}

	public static void darBajaEntrenosPrevios(Integer idUser) {
		TriTiEntrenoUsuario triTiEntrenoUsuario;

		SqlSessionFactory sqlMapper = MyBatisConnectionFactory
				.getSqlSessionFactory();
		SqlSession sqlSession = sqlMapper.openSession();
		try {

			TriTiEntrenoUsuarioMapper mapper = sqlSession
					.getMapper(TriTiEntrenoUsuarioMapper.class);

			TriTiEntrenoUsuarioExample usuarioEntrenoExample = new TriTiEntrenoUsuarioExample();
			usuarioEntrenoExample.createCriteria().andId_usuarioEqualTo(idUser).andFecha_bajaIsNull();

			
			for(int i = 0; i < mapper.selectByExample(usuarioEntrenoExample).size(); i++) { 
				triTiEntrenoUsuario = mapper.selectByExample(usuarioEntrenoExample)
						.get(i);
				
				triTiEntrenoUsuario.setFecha_baja(Calendar.getInstance().getTime());
				mapper.updateByPrimaryKey(triTiEntrenoUsuario);
			}
				sqlSession.commit();
			
		} finally {
			sqlSession.close();
		}

	}
	
	public static int dameNiveles(Integer minutos, Integer distance) {
		int minimo = 0;
		int pAdaptacion = 0;
		int minAmateur = 0, minMedio = 0, minPro = 0;
		switch (distance) {
		case 1:
			minAmateur = mASprint;
			minMedio = mMSprint;
			minPro = mpSprint;
			break;
		case 2:
			minAmateur = mAOlimpic;
			minMedio = mMOlimpic;
			minPro = mpOlimpic;
			break;
		}

		minimo = Math.min(
				Math.abs(minutos - minAmateur),
				Math.min(Math.abs(minutos - minMedio),
						Math.abs(minutos - minPro)));

		if (minutos >= minAmateur) {
			pAdaptacion = 20;

		}

		else if (Math.abs(minutos - minAmateur) < Math.abs(minutos - minMedio)) {
			pAdaptacion = (int) (pAmateur + ((minimo * 0.2) / (minAmateur - minMedio)));

		} else if (Math.abs(minutos - minAmateur) > Math
				.abs(minutos - minMedio)
				&& Math.abs(minutos - minMedio) < Math.abs(minutos - minPro)
				&& (Math.abs(minutos - minAmateur) < Math.abs(minutos - minPro))) {
			pAdaptacion = (int) (pMedio + ((minimo * 0.1) / (minAmateur - minMedio)));

		} else if (Math.abs(minutos - minAmateur) > Math
				.abs(minutos - minMedio)
				&& Math.abs(minutos - minMedio) < Math.abs(minutos - minPro)
				&& Math.abs(minutos - minAmateur) > Math.abs(minutos - minPro)) {
			pAdaptacion = (int) (pMedio + ((minimo * 0.1) / (minMedio - minPro)));

		} else if (minutos == minMedio) {
			pAdaptacion = 10;

		} else if (Math.abs(minutos - minPro) < Math.abs(minutos - minMedio)) {
			pAdaptacion = (int) (pPro + ((minimo) / (minMedio - minPro)));

		} else if (minutos <= minPro) {
			pAdaptacion = 0;

		}
		return pAdaptacion;

	}

	public static void entrenoAdaptacion(int semanas, int distance, int idEntreno, Calendar FechaInicio) {
		// TODO Auto-generated method stub
		List <TriTEjercicios> listaEjerciciosNatacion = new ArrayList <TriTEjercicios> ();
		List <TriTEjercicios> listaEjerciciosRunning = new ArrayList <TriTEjercicios> ();
		List <TriTEjercicios> listaEjerciciosCycle = new ArrayList <TriTEjercicios> ();
		Calendar fechaEjercicio= FechaInicio;
		int distaciaRun =0, distaciaSwim=0, distaciaCycle=0;
		TriTEjercicios ejercicio = new TriTEjercicios();
		SqlSessionFactory sqlMapper = MyBatisConnectionFactory
				.getSqlSessionFactory();
		SqlSession sqlSession = sqlMapper.openSession();
		Random rn = new Random();
		try {
			switch( distance){
			case 1: distaciaRun=DistRunSprintBase;
					distaciaCycle=DistCycleSprintBase;
					distaciaSwim=DistNatSprintBase;
					break;
					
			case 2: distaciaRun=DistRunOlimpicBase;
					distaciaCycle=DistCycleOlimpicBase;
					distaciaSwim=DistSwimOlimpicBase;
					break;
			}
			
			
			for (int i = 0; i < semanas; i++) {
				// cada semana
				listaEjerciciosNatacion = DameEjercicios(1, 1);
				listaEjerciciosCycle = DameEjercicios(1, 2);
				listaEjerciciosRunning = DameEjercicios(1, 3);
				int diaSemana = 0;

				for (int j = 0; j < 2; j++) {
					// cada dia de la semana

					// Natacion
					if (listaEjerciciosNatacion.size() == 0) {
						listaEjerciciosNatacion = DameEjercicios(1, 1);
					}
					TriTEntrenosMapper mapper = sqlSession
							.getMapper(TriTEntrenosMapper.class);
					TriTEntrenosExample entrenoExample = new TriTEntrenosExample();

					TriTEntrenos entreno = new TriTEntrenos();
					for (int h = 0; h < 4; h++) {
						entreno.setId_entreno(idEntreno);
						entreno.setDiaSemana(diaSemana);
						entreno.setSemana(i);
						entreno.setFecha(fechaEjercicio.getTime());
						entreno.setDistancia(distaciaSwim / 5);
						entreno.setIntensidad(1);
						ejercicio = listaEjerciciosNatacion.get(rn
								.nextInt(listaEjerciciosNatacion.size()));
						entreno.setId_ejercicio(ejercicio.getId_ejercicio());
						listaEjerciciosNatacion.remove(ejercicio);
						entreno.setSeries((ejercicio.getEnSeries() == 1) ? 100
								: 0);
						entreno.setRepeticiones((distaciaSwim / 5) / 100);
						mapper.insert(entreno);
						if (listaEjerciciosNatacion.size() == 0) {
							listaEjerciciosNatacion = DameEjercicios(1, 1);
						}
					}
					diaSemana++;
					fechaEjercicio.add(Calendar.DATE, 1);
					// RUNNING
					if (listaEjerciciosRunning.size() == 0) {
						listaEjerciciosRunning = DameEjercicios(1, 3);
					}
					entreno = new TriTEntrenos();
					for (int h = 0; h < 3; h++) {

						entreno.setId_entreno(idEntreno);
						entreno.setDiaSemana(diaSemana);
						entreno.setSemana(i);
						entreno.setFecha(fechaEjercicio.getTime());
						entreno.setDistancia(distaciaRun
								/ Math.min(3, listaEjerciciosRunning.size()));
						entreno.setIntensidad(1);
						ejercicio = listaEjerciciosRunning.get(rn
								.nextInt(listaEjerciciosRunning.size()));
						entreno.setId_ejercicio(ejercicio.getId_ejercicio());

						entreno.setSeries((ejercicio.getEnSeries() == 1) ? 1000
								: 0);
						entreno.setRepeticiones((ejercicio.getEnSeries() == 1) ? (distaciaRun / Math
								.min(3, listaEjerciciosRunning.size()))
								/ entreno.getSeries() : 1);
						mapper.insert(entreno);
						listaEjerciciosRunning.remove(ejercicio);
						if (listaEjerciciosRunning.size() == 0) {
							break;
						}

					}
					diaSemana++;
					fechaEjercicio.add(Calendar.DATE, 1);
					// Cycle
					if (listaEjerciciosCycle.size() == 0) {
						listaEjerciciosCycle = DameEjercicios(1, 2);
					}
					entreno = new TriTEntrenos();
					for (int h = 0; h < 3; h++) {
						entreno.setId_entreno(idEntreno);
						entreno.setDiaSemana(diaSemana);
						entreno.setSemana(i);
						entreno.setFecha(fechaEjercicio.getTime());
						entreno.setDistancia(distaciaCycle
								/ Math.min(3, listaEjerciciosCycle.size()));
						entreno.setIntensidad(1);
						ejercicio = listaEjerciciosCycle.get(rn
								.nextInt(listaEjerciciosCycle.size()));
						entreno.setId_ejercicio(ejercicio.getId_ejercicio());

						entreno.setSeries((ejercicio.getEnSeries() == 1) ? 1000
								: 0);
						entreno.setRepeticiones((ejercicio.getEnSeries() == 1) ? (distaciaCycle / Math
								.min(3, listaEjerciciosCycle.size()))
								/ entreno.getSeries() : 1);
						mapper.insert(entreno);
						listaEjerciciosCycle.remove(ejercicio);
						if (listaEjerciciosRunning.size() == 0) {
							break;
						}
					}

					diaSemana++;
					fechaEjercicio.add(Calendar.DATE, 1);
				}
			}
			sqlSession.commit();
			
		}
		catch (Exception e) {
			// TODO: handle exception
		throw	e;
			
		} finally {
			sqlSession.close();
		}
	}

	private static List<TriTEjercicios> DameEjercicios(int nivelEntreno, int tipoEntreno){
		
		SqlSessionFactory sqlMapper = MyBatisConnectionFactory
				.getSqlSessionFactory();
		SqlSession sqlSession = sqlMapper.openSession();
		try {
			TriTEjerciciosMapper mapper = sqlSession
					.getMapper(TriTEjerciciosMapper.class);
			
			TriTEjerciciosExample ejerciciosExample = new TriTEjerciciosExample();
			ejerciciosExample.createCriteria().andId_nivelLessThanOrEqualTo(nivelEntreno).andId_tipoEqualTo(tipoEntreno);
			return mapper.selectByExample(ejerciciosExample);
				
		}
	    finally {
		sqlSession.close();
		}
			
	}
	
	
}
