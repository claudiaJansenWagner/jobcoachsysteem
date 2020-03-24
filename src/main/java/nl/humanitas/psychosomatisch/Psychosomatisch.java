package nl.humanitas.psychosomatisch;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import nl.humanitas.deelnemer.Deelnemer;

@Entity
public class Psychosomatisch {

	@Id
	private String id;
	private String ziektebeeld;
	private String ambulanteBegeleider;
	private String omschrijving;
	private Long indicatieAantalUur;
	private String begindatumIndicatie;
	private String einddatumIndicatie;

	@ManyToOne
	private Deelnemer deelnemer;

	public Psychosomatisch() {

	}

	public Psychosomatisch(String id, String ziektebeeld, String ambulanteBegeleider, String omschrijving,
			Long indicatieAantalUur, String begindatumIndicatie, String einddatumIndicatie, String deelnemerId) {
		super();
		this.id = id;
		this.ziektebeeld = ziektebeeld;
		this.ambulanteBegeleider = ambulanteBegeleider;
		this.omschrijving = omschrijving;
		this.indicatieAantalUur = indicatieAantalUur;
		this.begindatumIndicatie = begindatumIndicatie;
		this.einddatumIndicatie = einddatumIndicatie;
		this.setDeelnemer(new Deelnemer(deelnemerId, "", "", "", "", ""));
	}

	public String getOmschrijving() {
		return omschrijving;
	}

	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}

	public Long getIndicatieAantalUur() {
		return indicatieAantalUur;
	}

	public void setIndicatieAantalUur(Long indicatieAantalUur) {
		this.indicatieAantalUur = indicatieAantalUur;
	}

	public String getBegindatumIndicatie() {
		return begindatumIndicatie;
	}

	public void setBegindatumIndicatie(String begindatumIndicatie) {
		this.begindatumIndicatie = begindatumIndicatie;
	}

	public String getEinddatumIndicatie() {
		return einddatumIndicatie;
	}

	public void setEinddatumIndicatie(String einddatumIndicatie) {
		this.einddatumIndicatie = einddatumIndicatie;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getZiektebeeld() {
		return ziektebeeld;
	}

	public void setZiektebeeld(String ziektebeeld) {
		this.ziektebeeld = ziektebeeld;
	}

	public String getAmbulanteBegeleider() {
		return ambulanteBegeleider;
	}

	public void setAmbulanteBegeleider(String ambulanteBegeleider) {
		this.ambulanteBegeleider = ambulanteBegeleider;
	}

	public Deelnemer getDeelnemer() {
		return deelnemer;
	}

	public void setDeelnemer(Deelnemer deelnemer) {
		this.deelnemer = deelnemer;
	}

}
