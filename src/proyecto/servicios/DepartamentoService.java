package proyecto.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import proyecto.repositorios.DepartamentoRepository;

@Component
public class DepartamentoService {

	@Autowired
	private DepartamentoRepository departamentoRepository;

	public DepartamentoRepository getDepartamentoRepository() {
		return departamentoRepository;
	}

	public void setDepartamentoRepository(DepartamentoRepository departamentoRepository) {
		this.departamentoRepository = departamentoRepository;
	}
	
	
}
