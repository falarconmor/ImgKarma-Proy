package proyecto.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_puntuacionpub")
public class PuntuacionPublicacion {
	
	
	@Id
	@GeneratedValue
	private Long valorpub;
	
	//fks
	@OneToMany
	private Usuario idusu = new Usuario();
	@OneToMany
	private Publicacion idpub = new Publicacion();
	public Long getValorpub() {
		return valorpub;
	}
	public void setValorpub(Long valorpub) {
		this.valorpub = valorpub;
	}
	public Usuario getIdusu() {
		return idusu;
	}
	public void setIdusu(Usuario idusu) {
		this.idusu = idusu;
	}
	public Publicacion getIdpub() {
		return idpub;
	}
	public void setIdpub(Publicacion idpub) {
		this.idpub = idpub;
	}
	
	


}
