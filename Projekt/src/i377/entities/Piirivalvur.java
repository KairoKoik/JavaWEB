package i377.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the PIIRIVALVUR database table.
 * 
 */
@Entity
public class Piirivalvur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String aadress;

	private String eesnimi;

	private String email;

	private String isikukood;

	private String kommentaar;

	private String perekonnanimi;

	private String sodurikood;

	private int sugu;

	private String telefon;

	private int version;

	//bi-directional many-to-one association to PiirivalvurVaeosas
	@OneToMany(mappedBy="piirivalvur")
	private List<PiirivalvurVaeosas> piirivalvurvaeosas;

	public Piirivalvur() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAadress() {
		return this.aadress;
	}

	public void setAadress(String aadress) {
		this.aadress = aadress;
	}

	public String getEesnimi() {
		return this.eesnimi;
	}

	public void setEesnimi(String eesnimi) {
		this.eesnimi = eesnimi;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIsikukood() {
		return this.isikukood;
	}

	public void setIsikukood(String isikukood) {
		this.isikukood = isikukood;
	}

	public String getKommentaar() {
		return this.kommentaar;
	}

	public void setKommentaar(String kommentaar) {
		this.kommentaar = kommentaar;
	}

	public String getPerekonnanimi() {
		return this.perekonnanimi;
	}

	public void setPerekonnanimi(String perekonnanimi) {
		this.perekonnanimi = perekonnanimi;
	}

	public String getSodurikood() {
		return this.sodurikood;
	}

	public void setSodurikood(String sodurikood) {
		this.sodurikood = sodurikood;
	}

	public int getSugu() {
		return this.sugu;
	}

	public void setSugu(int sugu) {
		this.sugu = sugu;
	}

	public String getTelefon() {
		return this.telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public List<PiirivalvurVaeosas> getPiirivalvurvaeosas() {
		return this.piirivalvurvaeosas;
	}

	public void setPiirivalvurvaeosas(List<PiirivalvurVaeosas> piirivalvurvaeosas) {
		this.piirivalvurvaeosas = piirivalvurvaeosas;
	}

}