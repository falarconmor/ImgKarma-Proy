package proyecto.managedbeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import proyecto.beans.Comentario;
import proyecto.beans.PuntuacionPublicacion;
import proyecto.servicios.PuntuacionPubService;

@ManagedBean
@SessionScoped
public class PuntuacionPublicacionMB {

	private PuntuacionPublicacion puntpub = new PuntuacionPublicacion();
	
	List<PuntuacionPublicacion> puntpubs = new ArrayList<PuntuacionPublicacion>();
	
	@ManagedProperty(value = "#{puntPubService}")
	private PuntuacionPubService puntPubService;

	public PuntuacionPublicacion getPuntpub() {
		return puntpub;
	}

	public void setPuntpub(PuntuacionPublicacion puntpub) {
		this.puntpub = puntpub;
	}

	public List<PuntuacionPublicacion> getPuntpubs() {
		return puntpubs;
	}

	public void setPuntpubs(List<PuntuacionPublicacion> puntpubs) {
		this.puntpubs = puntpubs;
	}

	public PuntuacionPubService getPuntPubService() {
		return puntPubService;
	}

	public void setPuntPubService(PuntuacionPubService puntPubService) {
		this.puntPubService = puntPubService;
	}
	
	
	
}
