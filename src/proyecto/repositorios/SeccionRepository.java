package proyecto.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proyecto.beans.Seccion;

@Repository
public interface SeccionRepository extends JpaRepository<Seccion, Long> {

}
