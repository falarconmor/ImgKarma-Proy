package proyecto.managedbeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import proyecto.beans.Comentario;
import proyecto.beans.Seccion;
import proyecto.servicios.SeccionService;

@ManagedBean
@SessionScoped
public class SeccionMB {
	
	private Seccion seccion = new Seccion();
	
	List<Seccion> secciones = new ArrayList<Seccion>();
	
	@ManagedProperty(value = "#{seccionService}")
	private SeccionService seccionService;

	public Seccion getSeccion() {
		return seccion;
	}

	public void setSeccion(Seccion seccion) {
		this.seccion = seccion;
	}

	public List<Seccion> getSecciones() {
		return secciones;
	}

	public void setSecciones(List<Seccion> secciones) {
		this.secciones = secciones;
	}

	public SeccionService getSeccionService() {
		return seccionService;
	}

	public void setSeccionService(SeccionService seccionService) {
		this.seccionService = seccionService;
	}
	
	
	

}
