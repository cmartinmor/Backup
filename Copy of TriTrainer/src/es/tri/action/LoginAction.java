package es.tri.action;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import es.mybatis.MyBatisConnectionFactory;
import es.tri.dao.TriTEntrenosMapper;
import es.tri.dao.TriTUsuariosMapper;
import es.tri.dao.TriTiEntrenoUsuarioMapper;
import es.tri.dao.model.TriTEntrenos;
import es.tri.dao.model.TriTEntrenosExample;
import es.tri.dao.model.TriTUsuarios;
import es.tri.dao.model.TriTUsuariosExample;
import es.tri.dao.model.TriTiEntrenoUsuario;
import es.tri.dao.model.TriTiEntrenoUsuarioExample;
import es.tri.objetos.Entrenamiento;
import es.tri.security.Security;
import es.tri.services.FuncionesComunesService;

public class LoginAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private TriTUsuarios triTUsuarios;
	private TriTiEntrenoUsuario triTUsuarioEntreno;
	private List <TriTEntrenos> triTEntrenosList;	
	private String porcentageR = "20";
	private String porcentageS = "30";
	private String porcentageC = "50";
	private Calendar fecha = Calendar.getInstance();
	private List<TriTEntrenos>  entrenoAyer, entrenoMayana;
	private TriTEntrenos UnicoentrenoAyer;
	private List <Entrenamiento> entrenamientoAyer, entrenamientoHoy, entrenamientoMayana;
	


	@SuppressWarnings("unchecked")
	public String execute() {

		String user = getUsername();
		String pass = getPassword();
		SqlSessionFactory sqlMapper = MyBatisConnectionFactory
				.getSqlSessionFactory();
		SqlSession sqlSession = sqlMapper.openSession();
		try {

			TriTUsuariosMapper mapper = sqlSession
					.getMapper(TriTUsuariosMapper.class);
			TriTUsuariosExample userexample = new TriTUsuariosExample();
			userexample.createCriteria().andUsuarioEqualTo(user);
			//TriTUsuarios triTUsuarios = new TriTUsuarios();
			
			if (mapper.selectByExample(userexample).size()>0) {
				triTUsuarios=mapper.selectByExample(userexample).get(0);
				if (Security.esCorrecta(pass, triTUsuarios.getPassword())) {
					Map session = ActionContext.getContext().getSession();
					session.put("usuario",triTUsuarios);
					
					TriTiEntrenoUsuarioExample entrenoUsuarioExample  = new TriTiEntrenoUsuarioExample();
					entrenoUsuarioExample.createCriteria().andId_usuarioEqualTo(triTUsuarios.getId_usuario()).andFecha_bajaIsNull();
					TriTiEntrenoUsuarioMapper mapperEntreno = sqlSession.getMapper(TriTiEntrenoUsuarioMapper.class);
					triTUsuarioEntreno = mapperEntreno.selectByExample(entrenoUsuarioExample).get(0);
					
					fecha.setTime(Calendar.getInstance().getTime());
					TriTEntrenosExample	entrenosExample	= new TriTEntrenosExample();
					entrenosExample.createCriteria().andId_entrenoEqualTo(triTUsuarioEntreno.getId_entreno()).andFechaEqualTo(fecha.getTime());
					TriTEntrenosMapper entrenosMapper = sqlSession.getMapper(TriTEntrenosMapper.class);
					triTEntrenosList = entrenosMapper.selectByExample(entrenosExample);		
					
					fecha.add(Calendar.DATE,-1);
					entrenosExample	= new TriTEntrenosExample();
					entrenosExample.createCriteria().andId_entrenoEqualTo(triTUsuarioEntreno.getId_entreno()).andFechaEqualTo(fecha.getTime());
					entrenosMapper = sqlSession.getMapper(TriTEntrenosMapper.class);
					entrenoAyer = entrenosMapper.selectByExample(entrenosExample);
					
					fecha.add(Calendar.DATE,2);
					entrenosExample	= new TriTEntrenosExample();
					entrenosExample.createCriteria().andId_entrenoEqualTo(triTUsuarioEntreno.getId_entreno()).andFechaEqualTo(fecha.getTime());
					entrenosMapper = sqlSession.getMapper(TriTEntrenosMapper.class);
					entrenoMayana = entrenosMapper.selectByExample(entrenosExample);	
					entrenamientoAyer = Entrenamiento.setEntrenamiento(entrenoAyer);
					entrenamientoHoy  = Entrenamiento.setEntrenamiento(triTEntrenosList);
					entrenamientoMayana  = Entrenamiento.setEntrenamiento(entrenoMayana);
					
					return "success";
				} else {
					addActionError(getText("error.login"));
					return "error";
				}
			}
			else 
			{
				addActionError(getText("error.login"));
				return "error";
			}
		} finally {
			sqlSession.close();
		}

	}


	public List<Entrenamiento> getEntrenamientoAyer() {
		return entrenamientoAyer;
	}


	public void setEntrenamientoAyer(List<Entrenamiento> entrenamientoAyer) {
		this.entrenamientoAyer = entrenamientoAyer;
	}


	public List<Entrenamiento> getEntrenamientoHoy() {
		return entrenamientoHoy;
	}


	public void setEntrenamientoHoy(List<Entrenamiento> entrenamientoHoy) {
		this.entrenamientoHoy = entrenamientoHoy;
	}


	public List<Entrenamiento> getEntrenamientoMayana() {
		return entrenamientoMayana;
	}


	public void setEntrenamientoMayana(List<Entrenamiento> entrenamientoMayana) {
		this.entrenamientoMayana = entrenamientoMayana;
	}


	public TriTUsuarios getTriTUsuarios() {
		return triTUsuarios;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public TriTiEntrenoUsuario getTriTUsuarioEntreno() {
		return triTUsuarioEntreno;
	}


	public void setTriTUsuarioEntreno(TriTiEntrenoUsuario triTUsuarioEntreno) {
		this.triTUsuarioEntreno = triTUsuarioEntreno;
	}


	public List<TriTEntrenos> getTriTEntrenosList() {
		return triTEntrenosList;
	}


	public void setTriTEntrenosList(List<TriTEntrenos> triTEntrenosList) {
		this.triTEntrenosList = triTEntrenosList;
	}


	public Calendar getFecha() {
		return fecha;
	}


	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}


	public List<TriTEntrenos> getEntrenoAyer() {
		return entrenoAyer;
	}


	public void setEntrenoAyer(List<TriTEntrenos> entrenoAyer) {
		this.entrenoAyer = entrenoAyer;
	}


	public List<TriTEntrenos> getEntrenoMayana() {
		return entrenoMayana;
	}


	public void setEntrenoMayana(List<TriTEntrenos> entrenoMayana) {
		this.entrenoMayana = entrenoMayana;
	}


	public TriTEntrenos getUnicoentrenoAyer() {
		return UnicoentrenoAyer;
	}


	public void setUnicoentrenoAyer(TriTEntrenos unicoentrenoAyer) {
		UnicoentrenoAyer = unicoentrenoAyer;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public void setTriTUsuarios(TriTUsuarios triTUsuarios) {
		this.triTUsuarios = triTUsuarios;
	}


	public void setPorcentageR(String porcentageR) {
		this.porcentageR = porcentageR;
	}


	public void setPorcentageS(String porcentageS) {
		this.porcentageS = porcentageS;
	}


	public void setPorcentageC(String porcentageC) {
		this.porcentageC = porcentageC;
	}


	public String getPorcentageR() {
		return porcentageR;
	}

	public String getPorcentageS() {
		return porcentageS;
	}

	public String getPorcentageC() {
		return porcentageC;
	}

}
