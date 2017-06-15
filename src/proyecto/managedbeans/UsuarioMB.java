package proyecto.managedbeans;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.google.common.collect.Lists;
import com.sun.xml.internal.ws.client.RequestContext;

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
	
	public String loginControl(){
		if(usuarioService.getUsuarioRepository().LoginControl(usuario.getUsername(), usuario.getPassword()) == true){
			return "sandro pon aca como se llame tu login";
		}

		return "";
		
		
	}

	
	// cosas que podrian ayudar
	
//	Iterable<Departamento> itDepartamentos 
//	= departamentoService.getDepartamentoRepository().findAll();
//	
//	Iterator<Departamento> it = itDepartamentos.iterator();
//	
//	departamentos.clear();
//	
//	while(it.hasNext()){
//		Departamento dep = it.next();
//		departamentos.add(dep);
//	}
	
	/*	
	@ManagedProperty(value = "#{empleadoService}")
	private EmpleadoService empleadoService;
	
	@ManagedProperty(value = "#{departamentoService}")
	private DepartamentoService departamentoService;

	
	public String guardar(){
		empleadoService.getEmpleadoRepository().save(empleado);
		empleado = new Empleado();
		return "registro_empleado";
	}
	
	public String eliminar(){
		empleadoService.getEmpleadoRepository().delete(empleado);
		empleado = new Empleado();
		return "registro_empleado";
	}
	
	public String editar(){
		FacesContext context = FacesContext.getCurrentInstance();
		Map<String, String> params = 
				context.getExternalContext()
				.getRequestParameterMap();
		
		String id = params.get("paramId");
		
		empleado = empleadoService
				.getEmpleadoRepository().findOne(new Long(id));
		
		return "editar_empleado";
	}
	
	
	---------------------------------------------------------
	
		public List<Empleado> getEmpleados() {
		empleados = Lists.newArrayList(
				empleadoService
				.getEmpleadoRepository()
				.findAll()
					);
		return empleados;
	}*/
	
	
}
