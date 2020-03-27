package nl.humanitas.model.gesprek;

import nl.humanitas.model.Deelnemer;

import javax.persistence.*;

@Entity
public class Gesprek {

	@Id
	private String id;
	private String datumGesprek;
	@Enumerated(EnumType.STRING)
	private Gespreksoort soortGesprek;
	private String verslagGesprek;

	@ManyToOne
	private Deelnemer deelnemer;

	public Gesprek() {

	}

	public Gesprek(String id, String datumGesprek, Gespreksoort soortGesprek, String verslagGesprek,
                   String deelnemerId) {
		super();
		this.id = id;
		this.datumGesprek = datumGesprek;
		this.soortGesprek = soortGesprek;
		this.verslagGesprek = verslagGesprek;
		this.setDeelnemer(new Deelnemer(deelnemerId, "", "", "", "", ""));
	}

	public String getSoortGesprek() {
		return soortGesprek.toString();
	}

	public void setSoortGesprek(Gespreksoort soortGesprek) {
		this.soortGesprek = soortGesprek;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDatumGesprek() {
		return datumGesprek;
	}

	public void setDatumGesprek(String datumGesprek) {
		this.datumGesprek = datumGesprek;
	}

	public String getVerslagGesprek() {
		return verslagGesprek;
	}

	public void setVerslagGesprek(String verslagGesprek) {
		this.verslagGesprek = verslagGesprek;
	}

	public Deelnemer getDeelnemer() {
		return deelnemer;
	}

	public void setDeelnemer(Deelnemer deelnemer) {
		this.deelnemer = deelnemer;
	}

}
