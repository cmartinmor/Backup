package es.tri.action;

import java.util.Calendar;
import java.util.Date;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import es.mybatis.MyBatisConnectionFactory;
import es.tri.dao.TriTiEntrenoUsuarioMapper;
import es.tri.dao.model.TriTEntrenos;
import es.tri.dao.model.TriTUsuarios;
import es.tri.dao.model.TriTiEntrenoUsuario;
import es.tri.dao.model.TriTiEntrenoUsuarioExample;
import es.tri.services.NuevoEntrenoService;

public class NuevoAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer distance;
	private Integer horasSwim;
	private Integer horasRun;
	private Integer horasCycle;
	private Integer minutosSwim;
	private Integer minutosCycle;
	private Integer minutosRun;
	private Date	fecha;

	@SuppressWarnings({ "unused", "unchecked", "rawtypes" })
	public String execute() {

		Integer distance = getDistance();
		Integer horasSwim = getHorasSwim();
		Integer horasRun = getHorasRun();
		Integer horasCycle = getHorasCycle();
		Integer minutosSwim = getMinutosSwim();
		Integer minutosCycle = getMinutosCycle();
		Integer minutosRun = getMinutosRun();
		Integer pAdaptacion=0,pGeneral = 0,pEspecifico=0;


		Date fecha = getFecha();
		Map session = ActionContext.getContext().getSession();
		Date today = Calendar.getInstance().getTime();
		Integer semanas = 0;
		
		SqlSessionFactory sqlMapper = MyBatisConnectionFactory
				.getSqlSessionFactory();
		SqlSession sqlSession = sqlMapper.openSession();

		try {
			Calendar FechaFin = Calendar.getInstance();
			//FechaFin.setFirstDayOfWeek(Calendar.MONDAY);
			Calendar FechaInicio = Calendar.getInstance();
			FechaFin.setTime(fecha);
			FechaInicio.setTime(Calendar.getInstance().getTime());
			//FechaInicio.setFirstDayOfWeek(Calendar.MONDAY);
			if (FechaInicio.get(Calendar.DAY_OF_WEEK)!=Calendar.MONDAY){
				FechaInicio.add(Calendar.DATE,(FechaInicio.get(Calendar.DAY_OF_WEEK)!=Calendar.SUNDAY)? 9-FechaInicio.get(Calendar.DAY_OF_WEEK):1);
				
			}
			
			if (FechaInicio.get(Calendar.YEAR)== FechaFin.get(Calendar.YEAR))		
				semanas = (FechaFin.get(Calendar.WEEK_OF_YEAR)-FechaInicio.get(Calendar.WEEK_OF_YEAR))+1;
			else if (FechaInicio.get(Calendar.YEAR) < FechaFin.get(Calendar.YEAR))
				semanas = (53- FechaInicio.get(Calendar.WEEK_OF_YEAR) )+ FechaFin.get(Calendar.WEEK_OF_YEAR) + ((FechaFin.get(Calendar.YEAR) - FechaInicio.get(Calendar.YEAR)-1)*53) ;
			else
				// Devolver mensaje de error en la pantalla
				return null;
			
			if (semanas<6){
				// Devolver mensaje de error en la pantalla
				return null;
			}
			
			TriTiEntrenoUsuarioMapper mapper = sqlSession.getMapper(TriTiEntrenoUsuarioMapper.class);
			
			TriTiEntrenoUsuarioExample usuarioEntrenoExample = new TriTiEntrenoUsuarioExample();

			TriTiEntrenoUsuario usuarioEntreno = new TriTiEntrenoUsuario();
			usuarioEntreno.setId_tipo_entreno(distance);
			TriTUsuarios triTUsuario =(TriTUsuarios) session.get("usuario");
			
			usuarioEntreno.setId_usuario(triTUsuario.getId_usuario());
			usuarioEntreno.setTiempoSwim(minutosSwim+(horasSwim*60));
			usuarioEntreno.setTiempoCycle(minutosCycle+(horasCycle*60));
			usuarioEntreno.setTiempoRun(minutosRun+(horasRun*60));
			
			
			if (NuevoEntrenoService.tieneEntrenos(triTUsuario.getId_usuario()))
				NuevoEntrenoService.darBajaEntrenosPrevios(triTUsuario.getId_usuario());
			
			
			
			int result = mapper.insert(usuarioEntreno);
			if (result > 0) {
				sqlSession.commit();
				
				TriTEntrenos entrenos = new TriTEntrenos();
				
				pAdaptacion=NuevoEntrenoService.dameNiveles(minutosSwim+(horasSwim*60)+minutosCycle+(horasCycle*60)+minutosRun+(horasRun*60),distance);
				pGeneral = (100-pAdaptacion)/2;
				pEspecifico = (100-pAdaptacion)/2;
				
				NuevoEntrenoService.entrenoAdaptacion((pAdaptacion* semanas)/100,distance,NuevoEntrenoService.idEntreno(triTUsuario.getId_usuario()),FechaInicio);
				//NuevoEntrenoService.entrenoGeneral(((pGeneral* semanas)/100)+1,entrenos);
				//NuevoEntrenoService.entrenoEspecifico((pEspecifico* semanas)/100,entrenos);
				return "success";
			} else
				return "error";

		} finally {
			sqlSession.close();
		}

	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Integer getDistance() {
		return distance;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	public Integer getHorasSwim() {
		if (horasSwim==null) {return 0;}	
		return horasSwim;
	}

	public void setHorasSwim(Integer horasSwim) {
		this.horasSwim = horasSwim;
	}

	public Integer getHorasRun() {
		if (horasRun==null) {return 0;}
		return horasRun;
	}

	public void setHorasRun(Integer horasRun) {
		this.horasRun = horasRun;
	}

	public Integer getHorasCycle() {
		if (horasCycle==null) {return 0;}
		return horasCycle;
	}

	public void setHorasCycle(Integer horasCycle) {
		this.horasCycle = horasCycle;
	}

	public Integer getMinutosSwim() {
		if (minutosSwim==null) {return 0;}
		return minutosSwim;
	}

	public void setMinutosSwim(Integer minutosSwim) {
		this.minutosSwim = minutosSwim;
	}

	public Integer getMinutosCycle() {
		if (minutosCycle==null) {return 0;}
		return minutosCycle;
	}

	public void setMinutosCycle(Integer minutosCycle) {
		this.minutosCycle = minutosCycle;
	}

	public Integer getMinutosRun() {
		if (minutosRun==null) {return 0;}
		return minutosRun;
	}

	public void setMinutosRun(Integer minutosRun) {
		this.minutosRun = minutosRun;
	}

}
