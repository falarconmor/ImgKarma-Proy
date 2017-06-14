package proyecto.managedbeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import proyecto.beans.Publicacion;
import proyecto.servicios.PublicacionService;

@ManagedBean
@SessionScoped
public class PublicacionMB {
	
	private Publicacion publicacion = new Publicacion();
	
	List<Publicacion> publicaciones = new ArrayList<Publicacion>();
	
	@ManagedProperty(value = "#{publicacionService}")
	private PublicacionService publicacionService;

	public Publicacion getPublicacion() {
		return publicacion;
	}

	public void setPublicacion(Publicacion publicacion) {
		this.publicacion = publicacion;
	}

	public List<Publicacion> getPublicaciones() {
		return publicaciones;
	}

	public void setPublicaciones(List<Publicacion> publicaciones) {
		this.publicaciones = publicaciones;
	}

	public PublicacionService getPublicacionService() {
		return publicacionService;
	}

	public void setPublicacionService(PublicacionService publicacionService) {
		this.publicacionService = publicacionService;
	}

	
	
}
