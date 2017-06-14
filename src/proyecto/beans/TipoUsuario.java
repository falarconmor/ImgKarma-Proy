package proyecto.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_tipousuario")
public class TipoUsuario {
	
	@Id
	@GeneratedValue
	private Long id;
	private String desctipousu;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDesctipousu() {
		return desctipousu;
	}
	public void setDesctipousu(String desctipousu) {
		this.desctipousu = desctipousu;
	}
	

}
