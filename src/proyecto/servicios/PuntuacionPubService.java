package proyecto.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import proyecto.repositorios.PuntuacionPubRepository;

@Component
public class PuntuacionPubService {

	@Autowired
	private PuntuacionPubRepository puntPubRepository;

	public PuntuacionPubRepository getPuntPubRepository() {
		return puntPubRepository;
	}

	public void setPuntPubRepository(PuntuacionPubRepository puntPubRepository) {
		this.puntPubRepository = puntPubRepository;
	}
	
	
}
