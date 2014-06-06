package es.tri.action;

import java.io.IOException;
import java.io.Reader;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import es.mybatis.MyBatisConnectionFactory;
import es.tri.dao.TriTUsuariosMapper;
import es.tri.dao.model.TriTUsuarios;
import es.tri.dao.model.TriTUsuariosExample;
import es.tri.security.Security;

public class RegistroAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String first_name;
	private String last_name;
	private String display_name;
	private String email;
	private String password;
	private String confirm_password;

	@SuppressWarnings({ "unused", "unchecked", "rawtypes" })
	public String execute() {

		String firstName = getFirst_name();
		String lastName = getLast_name();
		String displayName = getDisplay_name();
		String emailForm = getEmail();
		String pass = getPassword();

		SqlSessionFactory sqlMapper = MyBatisConnectionFactory
				.getSqlSessionFactory();
		SqlSession sqlSession = sqlMapper.openSession();

		try {

			TriTUsuariosMapper mapper = sqlSession
					.getMapper(TriTUsuariosMapper.class);
			TriTUsuariosExample userexample = new TriTUsuariosExample();
			userexample.createCriteria().andUsuarioEqualTo(displayName);
			TriTUsuarios usuario = new TriTUsuarios();

			if (mapper.selectByExample(userexample).size() == 0) {
				userexample = new TriTUsuariosExample();
				userexample.createCriteria().andEmailEqualTo(emailForm);
				if (mapper.selectByExample(userexample).size() == 0) {
					// registro del usuario
					usuario.setId_tipo_usuario(3);
					usuario.setEmail(emailForm);
					usuario.setUsuario(displayName);
					usuario.setNombre(firstName);
					usuario.setApellido(lastName);
					usuario.setPassword(Security.encriptar(pass));
					int result = mapper.insert(usuario);
					if (result > 0) {
						sqlSession.commit();
						Map session = ActionContext.getContext().getSession();
						session.put("usuario",usuario);
						return "success";
					} else
						return "error";
				} else {
					
					addFieldError("email", getText("error.email"));
					return "error";
				}
			} else {
				
				addFieldError("display_name", getText("error.user"));
				return "error";
			}
		} finally {
			sqlSession.close();
		}

	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getDisplay_name() {
		return display_name;
	}

	public void setDisplay_name(String display_name) {
		this.display_name = display_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirm_password() {
		return confirm_password;
	}

	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}
}
