package i377.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PIIRIVALVURVAEOSAS database table.
 * 
 */
@Entity
public class PiirivalvurVaeosas implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String kommentaar;

	private double koormus;

	private int version;

	//bi-directional many-to-one association to AmetVaeosas
	@ManyToOne
	@JoinColumn(name="AMETVAEOSAS_ID")
	private AmetVaeosas ametvaeosa;

	//bi-directional many-to-one association to Piirivalvur
	@ManyToOne
	private Piirivalvur piirivalvur;

	//bi-directional many-to-one association to Vaeosa
	@ManyToOne
	private Vaeosa vaeosa;

	public PiirivalvurVaeosas() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getKommentaar() {
		return this.kommentaar;
	}

	public void setKommentaar(String kommentaar) {
		this.kommentaar = kommentaar;
	}

	public double getKoormus() {
		return this.koormus;
	}

	public void setKoormus(double koormus) {
		this.koormus = koormus;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public AmetVaeosas getAmetvaeosa() {
		return this.ametvaeosa;
	}

	public void setAmetvaeosa(AmetVaeosas ametvaeosa) {
		this.ametvaeosa = ametvaeosa;
	}

	public Piirivalvur getPiirivalvur() {
		return this.piirivalvur;
	}

	public void setPiirivalvur(Piirivalvur piirivalvur) {
		this.piirivalvur = piirivalvur;
	}

	public Vaeosa getVaeosa() {
		return this.vaeosa;
	}

	public void setVaeosa(Vaeosa vaeosa) {
		this.vaeosa = vaeosa;
	}

}