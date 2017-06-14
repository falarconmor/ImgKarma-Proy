package proyecto.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import proyecto.beans.PuntuacionComentario;

@Repository
public interface PuntuacionComRepository extends JpaRepository<PuntuacionComentario, Long>{
	
	

}
