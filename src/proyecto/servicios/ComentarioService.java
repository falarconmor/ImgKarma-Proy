package proyecto.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import proyecto.repositorios.ComentarioRepository;

@Component
public class ComentarioService {
	
	@Autowired
	private ComentarioRepository comentarioRepository;

	public ComentarioRepository getComentarioRepository() {
		return comentarioRepository;
	}

	public void setComentarioRepository(ComentarioRepository comentarioRepository) {
		this.comentarioRepository = comentarioRepository;
	}
	
	
	

}
