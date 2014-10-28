package es.tri.services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import es.mybatis.MyBatisConnectionFactory;
import es.tri.dao.TriTEjerciciosMapper;
import es.tri.dao.model.TriTEjercicios;
import es.tri.dao.model.TriTEjerciciosExample;
import es.tri.dao.model.TriTEntrenos;
import es.tri.objetos.Entrenamiento;

public class FuncionesComunesService {

	
	public static List<TriTEntrenos> cargaEntreno (List<TriTEntrenos> lista, Calendar fecha) {
		List <TriTEntrenos> listaFecha = new ArrayList <TriTEntrenos> ();
		Calendar FechaAux = Calendar.getInstance();
		for (TriTEntrenos entreno : lista){
			FechaAux.setTime(entreno.getFecha());
			
			if (FechaAux.after(fecha)){break;}
			if (FechaAux.get(Calendar.YEAR)== fecha.get(Calendar.YEAR) && FechaAux.get(Calendar.MONTH)== fecha.get(Calendar.MONTH) && FechaAux.get(Calendar.DAY_OF_MONTH)==fecha.get(Calendar.DAY_OF_MONTH)){
				listaFecha.add(entreno);
			}
			
		}
		
		return listaFecha;
		
	}
	
	
	
}
