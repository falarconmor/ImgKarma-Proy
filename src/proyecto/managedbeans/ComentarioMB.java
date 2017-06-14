package proyecto.managedbeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import proyecto.beans.Comentario;
import proyecto.servicios.ComentarioService;


@ManagedBean
@SessionScoped
public class ComentarioMB {
	
	private Comentario comentario = new Comentario();
	
	List<Comentario> comentarios = new ArrayList<Comentario>();
	
	@ManagedProperty(value = "#{comentarioService}")
	private ComentarioService comentarioService;

	public Comentario getComentario() {
		return comentario;
	}

	public void setComentario(Comentario comentario) {
		this.comentario = comentario;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	public ComentarioService getComentarioService() {
		return comentarioService;
	}

	public void setComentarioService(ComentarioService comentarioService) {
		this.comentarioService = comentarioService;
	}
	
	

}
