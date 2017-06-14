package proyecto.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import proyecto.repositorios.PuntuacionComRepository;

@Component
public class PuntuacionComService {
	
	@Autowired
	private PuntuacionComRepository puntComRepository;

	public PuntuacionComRepository getPuntComRepository() {
		return puntComRepository;
	}

	public void setPuntComRepository(PuntuacionComRepository puntComRepository) {
		this.puntComRepository = puntComRepository;
	}
	
	
}
