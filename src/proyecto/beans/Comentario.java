package proyecto.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_comentario")
public class Comentario {
	
	@Id
	@GeneratedValue
	private Long id;
	private String mensajecom;
	private Date fechacom;
	//fks
	private Usuario idusu = new Usuario();
	private Publicacion idpub = new Publicacion();
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMensajecom() {
		return mensajecom;
	}
	public void setMensajecom(String mensajecom) {
		this.mensajecom = mensajecom;
	}
	public Date getFechacom() {
		return fechacom;
	}
	public void setFechacom(Date fechacom) {
		this.fechacom = fechacom;
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
