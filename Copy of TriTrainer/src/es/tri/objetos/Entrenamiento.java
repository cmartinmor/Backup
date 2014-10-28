package es.tri.objetos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import es.mybatis.MyBatisConnectionFactory;
import es.tri.dao.TriTEjerciciosMapper;
import es.tri.dao.model.TriTEjercicios;
import es.tri.dao.model.TriTEjerciciosExample;
import es.tri.dao.model.TriTEntrenos;

public class Entrenamiento {
	 private Integer id_entreno_ejercicio;

	    private Integer id_entreno;

	    private Integer id_ejercicio;

	    private Date fecha_baja;

	    private Integer valoracion;

	    private Integer pulsaciones;

	    private Integer conseguido;

	    private Date tiempo;

	    private Integer intensidad;

	    private Integer distancia;

	    private Integer series;

	    private Integer repeticiones;

	    private Integer descanso;

	    private Date fecha;

	    private Integer diaSemana;

	    private Integer semana;

	    private String descripcion;

	    private String URL_video;

	    private Integer id_tipo;

	    private Integer id_nivel;

	    private Integer enSeries;

	    public String getDescripcion() {
	        return descripcion;
	    }

	    public void setDescripcion(String descripcion) {
	        this.descripcion = descripcion;
	    }

	    public String getURL_video() {
	        return URL_video;
	    }

	    public void setURL_video(String URL_video) {
	        this.URL_video = URL_video;
	    }

	    public Integer getId_tipo() {
	        return id_tipo;
	    }

	    public void setId_tipo(Integer id_tipo) {
	        this.id_tipo = id_tipo;
	    }

	    public Integer getId_nivel() {
	        return id_nivel;
	    }

	    public void setId_nivel(Integer id_nivel) {
	        this.id_nivel = id_nivel;
	    }

	    public Integer getEnSeries() {
	        return enSeries;
	    }

	    public void setEnSeries(Integer enSeries) {
	        this.enSeries = enSeries;
	    }
	    public Integer getId_entreno_ejercicio() {
	        return id_entreno_ejercicio;
	    }

	    public void setId_entreno_ejercicio(Integer id_entreno_ejercicio) {
	        this.id_entreno_ejercicio = id_entreno_ejercicio;
	    }

	    public Integer getId_entreno() {
	        return id_entreno;
	    }

	    public void setId_entreno(Integer id_entreno) {
	        this.id_entreno = id_entreno;
	    }

	    public Integer getId_ejercicio() {
	        return id_ejercicio;
	    }

	    public void setId_ejercicio(Integer id_ejercicio) {
	        this.id_ejercicio = id_ejercicio;
	    }

	    public Date getFecha_baja() {
	        return fecha_baja;
	    }

	    public void setFecha_baja(Date fecha_baja) {
	        this.fecha_baja = fecha_baja;
	    }

	    public Integer getValoracion() {
	        return valoracion;
	    }

	    public void setValoracion(Integer valoracion) {
	        this.valoracion = valoracion;
	    }

	    public Integer getPulsaciones() {
	        return pulsaciones;
	    }

	    public void setPulsaciones(Integer pulsaciones) {
	        this.pulsaciones = pulsaciones;
	    }

	    public Integer getConseguido() {
	        return conseguido;
	    }

	    public void setConseguido(Integer conseguido) {
	        this.conseguido = conseguido;
	    }

	    public Date getTiempo() {
	        return tiempo;
	    }

	    public void setTiempo(Date tiempo) {
	        this.tiempo = tiempo;
	    }

	    public Integer getIntensidad() {
	        return intensidad;
	    }

	    public void setIntensidad(Integer intensidad) {
	        this.intensidad = intensidad;
	    }

	    public Integer getDistancia() {
	        return distancia;
	    }

	    public void setDistancia(Integer distancia) {
	        this.distancia = distancia;
	    }

	    public Integer getSeries() {
	        return series;
	    }

	    public void setSeries(Integer series) {
	        this.series = series;
	    }

	    public Integer getRepeticiones() {
	        return repeticiones;
	    }

	    public void setRepeticiones(Integer repeticiones) {
	        this.repeticiones = repeticiones;
	    }

	    public Integer getDescanso() {
	        return descanso;
	    }

	    public void setDescanso(Integer descanso) {
	        this.descanso = descanso;
	    }

	    public Date getFecha() {
	        return fecha;
	    }

	    public void setFecha(Date fecha) {
	        this.fecha = fecha;
	    }

	    public Integer getDiaSemana() {
	        return diaSemana;
	    }

	    public void setDiaSemana(Integer diaSemana) {
	        this.diaSemana = diaSemana;
	    }

	    public Integer getSemana() {
	        return semana;
	    }

	    public void setSemana(Integer semana) {
	        this.semana = semana;
	    }
	    
	    public static List<Entrenamiento> setEntrenamiento (List<TriTEntrenos> entreno){
			
			List<Entrenamiento> entrenamiento = new ArrayList<Entrenamiento> ();
			Entrenamiento entrenamientoAux;
			TriTEjercicios triTEjercicios;
			for (TriTEntrenos lista : entreno){
				
				SqlSessionFactory sqlMapper = MyBatisConnectionFactory
						.getSqlSessionFactory();
				SqlSession sqlSession = sqlMapper.openSession();
				
				try {
					TriTEjerciciosMapper mapper = sqlSession
							.getMapper(TriTEjerciciosMapper.class);
					
					TriTEjerciciosExample ejerciciosExample = new TriTEjerciciosExample();
					ejerciciosExample.createCriteria().andId_ejercicioEqualTo(lista.getId_ejercicio());
					triTEjercicios= mapper.selectByExample(ejerciciosExample).get(0);
						
				}
			    finally {
				sqlSession.close();
				}
				entrenamientoAux = new Entrenamiento();
				entrenamientoAux.setConseguido(null);
				entrenamientoAux.setDescanso(0);
				entrenamientoAux.setDescripcion(triTEjercicios.getDescripcion());
				entrenamientoAux.setDiaSemana(lista.getDiaSemana());
				entrenamientoAux.setEnSeries(triTEjercicios.getEnSeries());
				entrenamientoAux.setFecha(lista.getFecha());
				entrenamientoAux.setFecha_baja(null);
				entrenamientoAux.setId_ejercicio(lista.getId_ejercicio());
				entrenamientoAux.setId_entreno(lista.getId_entreno());
				entrenamientoAux.setId_entreno_ejercicio(lista.getId_entreno_ejercicio());
				entrenamientoAux.setId_nivel(triTEjercicios.getId_nivel());
				entrenamientoAux.setId_tipo(triTEjercicios.getId_tipo());
				entrenamientoAux.setIntensidad(lista.getIntensidad());
				entrenamientoAux.setPulsaciones(lista.getPulsaciones());
				entrenamientoAux.setSemana(lista.getSemana());
				entrenamientoAux.setSeries(lista.getSeries());
				entrenamientoAux.setURL_video(triTEjercicios.getURL_video());
				entrenamientoAux.setValoracion(lista.getValoracion());
				entrenamiento.add(entrenamientoAux);
			}
			
			return entrenamiento;
			
		}
}
