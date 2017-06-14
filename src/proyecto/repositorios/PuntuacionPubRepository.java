package proyecto.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import proyecto.beans.PuntuacionPublicacion;

@Repository
public interface PuntuacionPubRepository extends JpaRepository<PuntuacionPublicacion, Long>{

}
