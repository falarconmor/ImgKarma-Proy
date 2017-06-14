package proyecto.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import proyecto.beans.Departamento;

@Repository
public interface DepartamentoRepository 
	extends CrudRepository<Departamento, Long>{

}
