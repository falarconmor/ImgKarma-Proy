package proyecto.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proyecto.beans.Comentario;

@Repository
public interface ComentarioRepository extends JpaRepository<Comentario, Long>{

}
