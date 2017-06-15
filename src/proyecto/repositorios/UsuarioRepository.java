package proyecto.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import proyecto.beans.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	
	@Query("select e from Usuario e where e.username = :username and e.password = :password")
	public boolean LoginControl(@Param("username")String username, @Param("password")String password);
	
			
	/*	
	@Query("select e from Empleado e where e.nombre like %:nom%")
	List<Empleado> obtenerEmpleadosPorNombre(
			@Param("nom") String nombre);
	*/

}
