package es.tri.services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import es.mybatis.MyBatisConnectionFactory;
import es.tri.dao.TriTEjerciciosMapper;
import es.tri.dao.TriTiEntrenoUsuarioMapper;
import es.tri.dao.model.TriTEjercicios;
import es.tri.dao.model.TriTEjerciciosExample;
import es.tri.dao.model.TriTEntrenos;
import es.tri.dao.model.TriTiEntrenoUsuario;
import es.tri.dao.model.TriTiEntrenoUsuarioExample;

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
	
	public static List<String> obternerPorcentages(List<TriTEntrenos> lista){
		List <String> result = new ArrayList<>();
		int pr=0,pc=0,ps =0;
		TriTEjercicios triTEjercicios;

		
		SqlSessionFactory sqlMapper = MyBatisConnectionFactory
				.getSqlSessionFactory();
		
		for (TriTEntrenos entreno : lista){
			SqlSession sqlSession = sqlMapper.openSession();
			
			try {
				TriTEjerciciosMapper mapper = sqlSession
						.getMapper(TriTEjerciciosMapper.class);					
					triTEjercicios= mapper.selectByPrimaryKey(entreno.getId_ejercicio());
					if (triTEjercicios.getId_tipo()==1) ps+=entreno.getDistancia();
					else if (triTEjercicios.getId_tipo()==2) pc+=entreno.getDistancia();
					else pr+=entreno.getDistancia();
					
				}
				finally {
					sqlSession.close();
				}
			}
		SqlSession sqlSession = sqlMapper.openSession();
		TriTiEntrenoUsuarioMapper mapper = sqlSession.getMapper(TriTiEntrenoUsuarioMapper.class);
		TriTiEntrenoUsuario triTiEntrenoUsuario = new TriTiEntrenoUsuario();
		triTiEntrenoUsuario= mapper.selectByPrimaryKey(lista.get(0).getId_entreno());
		
		if (triTiEntrenoUsuario.getId_tipo_entreno()==1){
			ps=ps/NuevoEntrenoService.DistNatSprintBase;
			pc=pc/NuevoEntrenoService.DistCycleSprintBase;
			pr=pr/NuevoEntrenoService.DistRunSprintBase;
		}
		else if (triTiEntrenoUsuario.getId_tipo_entreno()==2){
			ps=ps/NuevoEntrenoService.DistSwimOlimpicBase;
			pc=pc/NuevoEntrenoService.DistCycleOlimpicBase;
			pr=pr/NuevoEntrenoService.DistRunOlimpicBase ;
		}
		
		
		
		int total = pc+ps+pr;
		pc=(pc*100)/total;
		ps=(ps*100)/total;
		pr=(pr*100)/total;
		result.add(String.valueOf(ps));	
		result.add(String.valueOf(pc));	
		result.add(String.valueOf(pr));	
		return result;
	}
	
}
