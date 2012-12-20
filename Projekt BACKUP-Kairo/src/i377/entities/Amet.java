package i377.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the AMET database table.
 * 
 */
@Entity
public class Amet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String iscokood;

	private String kommentaar;

	private String nimetus;

	private int version;

	//bi-directional many-to-one association to AmetVaeosas
	@OneToMany(mappedBy="amet")
	private List<AmetVaeosas> ametvaeosas;

	public Amet() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIscokood() {
		return this.iscokood;
	}

	public void setIscokood(String iscokood) {
		this.iscokood = iscokood;
	}

	public String getKommentaar() {
		return this.kommentaar;
	}

	public void setKommentaar(String kommentaar) {
		this.kommentaar = kommentaar;
	}

	public String getNimetus() {
		return this.nimetus;
	}

	public void setNimetus(String nimetus) {
		this.nimetus = nimetus;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public List<AmetVaeosas> getAmetvaeosas() {
		return this.ametvaeosas;
	}

	public void setAmetvaeosas(List<AmetVaeosas> ametvaeosas) {
		this.ametvaeosas = ametvaeosas;
	}

}