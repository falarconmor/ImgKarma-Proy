package proyecto.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_seccion")
public class Seccion {
	
	@Id
	@GeneratedValue
	private Long idsec;
	private String nomsec;
	public Long getIdsec() {
		return idsec;
	}
	public void setIdsec(Long idsec) {
		this.idsec = idsec;
	}
	public String getNomsec() {
		return nomsec;
	}
	public void setNomsec(String nomsec) {
		this.nomsec = nomsec;
	}
	
	

}
