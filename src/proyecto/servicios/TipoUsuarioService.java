package proyecto.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import proyecto.repositorios.TipoUsuarioRepository;

@Component
public class TipoUsuarioService {
	
	@Autowired
	private TipoUsuarioRepository tipoUsuRepository;

	public TipoUsuarioRepository getTipoUsuRepository() {
		return tipoUsuRepository;
	}

	public void setTipoUsuRepository(TipoUsuarioRepository tipoUsuRepository) {
		this.tipoUsuRepository = tipoUsuRepository;
	}
	
	

}
