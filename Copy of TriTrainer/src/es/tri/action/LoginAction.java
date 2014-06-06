package es.tri.action;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
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
import es.tri.dao.TriTUsuariosMapper;
import es.tri.dao.model.TriTUsuarios;
import es.tri.dao.model.TriTUsuariosExample;
import es.tri.security.Security;

public class LoginAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private TriTUsuarios triTUsuarios;
	private String porcentageR = "20";
	private String porcentageS = "30";
	private String porcentageC = "50";
	


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


	public TriTUsuarios getTriTUsuarios() {
		return triTUsuarios;
	}

//	public void setTriTUsuarios(TriTUsuarios triTUsuarios) {
//		this.triTUsuarios = triTUsuarios;
//	}

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
