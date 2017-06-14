package proyecto.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tb_publicacion")
public class Publicacion {

	
	@Id
	@GeneratedValue
	private Long idpub;
	private String dirpub;
	private String titpub;
	private String contpub;
	private Date fechpub;
	private String estpub;
	//fks
	private Seccion idsec = new Seccion();
	private Usuario idusu = new Usuario();
	public Long getIdpub() {
		return idpub;
	}
	public void setIdpub(Long idpub) {
		this.idpub = idpub;
	}
	public String getDirpub() {
		return dirpub;
	}
	public void setDirpub(String dirpub) {
		this.dirpub = dirpub;
	}
	public String getTitpub() {
		return titpub;
	}
	public void setTitpub(String titpub) {
		this.titpub = titpub;
	}
	public String getContpub() {
		return contpub;
	}
	public void setContpub(String contpub) {
		this.contpub = contpub;
	}
	public Date getFechpub() {
		return fechpub;
	}
	public void setFechpub(Date fechpub) {
		this.fechpub = fechpub;
	}
	public String getEstpub() {
		return estpub;
	}
	public void setEstpub(String estpub) {
		this.estpub = estpub;
	}
	public Seccion getIdsec() {
		return idsec;
	}
	public void setIdsec(Seccion idsec) {
		this.idsec = idsec;
	}
	public Usuario getIdusu() {
		return idusu;
	}
	public void setIdusu(Usuario idusu) {
		this.idusu = idusu;
	}
	

	

}
