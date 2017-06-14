package proyecto.managedbeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import proyecto.beans.TipoUsuario;
import proyecto.servicios.TipoUsuarioService;

@ManagedBean
@SessionScoped
public class TipoUsuarioMB {
	
	private TipoUsuario tusu = new TipoUsuario();
	
	List<TipoUsuario> tusus = new ArrayList<TipoUsuario>();
	
	@ManagedProperty(value = "#{tipoUsuService}")
	private TipoUsuarioService tipoUsuService;

	public TipoUsuario getTusu() {
		return tusu;
	}

	public void setTusu(TipoUsuario tusu) {
		this.tusu = tusu;
	}

	public List<TipoUsuario> getTusus() {
		return tusus;
	}

	public void setTusus(List<TipoUsuario> tusus) {
		this.tusus = tusus;
	}

	public TipoUsuarioService getTipoUsuService() {
		return tipoUsuService;
	}

	public void setTipoUsuService(TipoUsuarioService tipoUsuService) {
		this.tipoUsuService = tipoUsuService;
	}
	
	

}
