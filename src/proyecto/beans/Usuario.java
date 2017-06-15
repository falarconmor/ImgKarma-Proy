package proyecto.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import proyecto.beans.TipoUsuario;

@Entity
@Table(name="tb_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue
	private Long idusu;
	private String nombreusu;
	private String apeusu;
	private String emailusu;
	private String password;
	private String username;
	//@Temporal(TemporalType.DATE)
	private Date fecnacusu;
	private String descusu;
	private String sexusu;
	private Date fecregusu;
	
	//many to one
	
	@ManyToOne
	private TipoUsuario tusu = new TipoUsuario();

	public Long getIdusu() {
		return idusu;
	}

	public void setIdusu(Long idusu) {
		this.idusu = idusu;
	}

	public String getNombreusu() {
		return nombreusu;
	}

	public void setNombreusu(String nombreusu) {
		this.nombreusu = nombreusu;
	}

	public String getApeusu() {
		return apeusu;
	}

	public void setApeusu(String apeusu) {
		this.apeusu = apeusu;
	}

	public String getEmailusu() {
		return emailusu;
	}

	public void setEmailusu(String emailusu) {
		this.emailusu = emailusu;
	}
    
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getFecnacusu() {
		return fecnacusu;
	}

	public void setFecnacusu(Date fecnacusu) {
		this.fecnacusu = fecnacusu;
	}

	public String getDescusu() {
		return descusu;
	}

	public void setDescusu(String descusu) {
		this.descusu = descusu;
	}

	public String getSexusu() {
		return sexusu;
	}

	public void setSexusu(String sexusu) {
		this.sexusu = sexusu;
	}

	public Date getFecregusu() {
		return fecregusu;
	}

	public void setFecregusu(Date fecregusu) {
		this.fecregusu = fecregusu;
	}

	public TipoUsuario getTusu() {
		return tusu;
	}

	public void setTusu(TipoUsuario tusu) {
		this.tusu = tusu;
	}

	
	
	
}
