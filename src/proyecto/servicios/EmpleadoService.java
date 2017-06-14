package proyecto.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import proyecto.repositorios.EmpleadoRepository;

@Component
public class EmpleadoService {
	
	@Autowired
	private EmpleadoRepository empleadoRepository;

	public EmpleadoRepository getEmpleadoRepository() {
		return empleadoRepository;
	}

	public void setEmpleadoRepository(EmpleadoRepository empleadoRepository) {
		this.empleadoRepository = empleadoRepository;
	}
	 
	

}
