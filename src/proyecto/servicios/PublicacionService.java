package proyecto.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import proyecto.repositorios.PublicacionRepository;

@Component
public class PublicacionService {
	
	@Autowired
	private PublicacionRepository publicacionRepository;

	public PublicacionRepository getPublicacionRepository() {
		return publicacionRepository;
	}

	public void setPublicacionRepository(PublicacionRepository publicacionRepository) {
		this.publicacionRepository = publicacionRepository;
	}

	
}
