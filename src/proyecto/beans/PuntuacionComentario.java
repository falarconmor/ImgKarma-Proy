package proyecto.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_puntuacioncom")
public class PuntuacionComentario {
	
	
	@Id
	@GeneratedValue
	private Long valorcom;
	
	@OneToMany(mappedBy="Usuario")
	private Usuario idusu = new Usuario();
	@OneToMany(mappedBy="Comentario")
	private Comentario idpub = new Comentario();
	
	public Long getValorcom() {
		return valorcom;
	}
	public void setValorcom(Long valorcom) {
		this.valorcom = valorcom;
	}
	public Usuario getIdusu() {
		return idusu;
	}
	public void setIdusu(Usuario idusu) {
		this.idusu = idusu;
	}
	public Comentario getIdpub() {
		return idpub;
	}
	public void setIdpub(Comentario idpub) {
		this.idpub = idpub;
	}

	
	
}
