package proyecto.managedbeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import proyecto.beans.Usuario;
import proyecto.servicios.UsuarioService;

@ManagedBean
@SessionScoped
public class UsuarioMB {
	
	private Usuario usuario = new Usuario();
	
	List<Usuario> usuarios = new ArrayList<Usuario>();
	
	@ManagedProperty(value = "#{usuarioService}")
	private UsuarioService usuarioService;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public UsuarioService getUsuarioService() {
		return usuarioService;
	}

	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	
	
}
