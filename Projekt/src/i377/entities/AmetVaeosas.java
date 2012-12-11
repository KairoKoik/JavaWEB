package i377.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the AMETVAEOSAS database table.
 * 
 */
@Entity
public class AmetVaeosas implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private Timestamp alates;

	private String kommentaar;

	private Timestamp kuni;

	private int version;

	//bi-directional many-to-one association to Amet
	@ManyToOne
	private Amet amet;

	//bi-directional many-to-one association to Vaeosa
	@ManyToOne
	private Vaeosa vaeosa;

	//bi-directional many-to-one association to PiirivalvurVaeosas
	@OneToMany(mappedBy="ametvaeosa")
	private List<PiirivalvurVaeosas> piirivalvurvaeosas;

	public AmetVaeosas() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Timestamp getAlates() {
		return this.alates;
	}

	public void setAlates(Timestamp alates) {
		this.alates = alates;
	}

	public String getKommentaar() {
		return this.kommentaar;
	}

	public void setKommentaar(String kommentaar) {
		this.kommentaar = kommentaar;
	}

	public Timestamp getKuni() {
		return this.kuni;
	}

	public void setKuni(Timestamp kuni) {
		this.kuni = kuni;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Amet getAmet() {
		return this.amet;
	}

	public void setAmet(Amet amet) {
		this.amet = amet;
	}

	public Vaeosa getVaeosa() {
		return this.vaeosa;
	}

	public void setVaeosa(Vaeosa vaeosa) {
		this.vaeosa = vaeosa;
	}

	public List<PiirivalvurVaeosas> getPiirivalvurvaeosas() {
		return this.piirivalvurvaeosas;
	}

	public void setPiirivalvurvaeosas(List<PiirivalvurVaeosas> piirivalvurvaeosas) {
		this.piirivalvurvaeosas = piirivalvurvaeosas;
	}

}