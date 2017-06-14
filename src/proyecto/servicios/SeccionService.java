package proyecto.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import proyecto.repositorios.SeccionRepository;

@Component
public class SeccionService {
	
	@Autowired
	private SeccionRepository seccionRepository;

	public SeccionRepository getSeccionRepository() {
		return seccionRepository;
	}

	public void setSeccionRepository(SeccionRepository seccionRepository) {
		this.seccionRepository = seccionRepository;
	}

	
}
