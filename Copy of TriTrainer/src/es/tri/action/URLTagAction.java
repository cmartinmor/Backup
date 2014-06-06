package es.tri.action;

import com.opensymphony.xwork2.ActionSupport;

public class URLTagAction extends ActionSupport{
	private String id;
	private String IdPropuesta;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIdPropuesta() {
		return IdPropuesta;
	}
	public void setIdPropuesta(String idPropuesta) {
		IdPropuesta = idPropuesta;
	}
	public String execute() {
		if (id.equals(null) ) {
			
		}
		return SUCCESS;
	}
 
}
