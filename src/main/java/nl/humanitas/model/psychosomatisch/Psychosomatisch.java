package nl.humanitas.model.psychosomatisch;

import nl.humanitas.model.Deelnemer;

import javax.persistence.*;

@Entity
public class Psychosomatisch {

	@Id
	private String id;
	@Enumerated(EnumType.STRING)
	private Ziektebeeld ziektebeeld;
	private String ambulanteBegeleider;
	private String omschrijving;
	private Long indicatieAantalUur;
	private String begindatumIndicatie;
	private String einddatumIndicatie;

	@ManyToOne
	private Deelnemer deelnemer;

	public Psychosomatisch() {

	}

	public Psychosomatisch(String id, Ziektebeeld ziektebeeld, String ambulanteBegeleider, String omschrijving,
                           Long indicatieAantalUur, String begindatumIndicatie, String einddatumIndicatie,
                           String deelnemerId) {
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

	public Ziektebeeld getZiektebeeld() {
		return ziektebeeld;
	}

	public void setZiektebeeld(Ziektebeeld ziektebeeld) {
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
