package proyecto.managedbeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;


import proyecto.beans.PuntuacionComentario;
import proyecto.servicios.PuntuacionComService;

@ManagedBean
@SessionScoped
public class PuntuacionComentarioMB {

	
	private PuntuacionComentario puntcom = new PuntuacionComentario();
	
	List<PuntuacionComentario> puntcoms = new ArrayList<PuntuacionComentario>();
	
	@ManagedProperty(value = "#{puntComService}")
	private PuntuacionComService puntComService;

	public PuntuacionComentario getPuntcom() {
		return puntcom;
	}

	public void setPuntcom(PuntuacionComentario puntcom) {
		this.puntcom = puntcom;
	}

	public List<PuntuacionComentario> getPuntcoms() {
		return puntcoms;
	}

	public void setPuntcoms(List<PuntuacionComentario> puntcoms) {
		this.puntcoms = puntcoms;
	}

	public PuntuacionComService getPuntComService() {
		return puntComService;
	}

	public void setPuntComService(PuntuacionComService puntComService) {
		this.puntComService = puntComService;
	}
	
	
	
}
