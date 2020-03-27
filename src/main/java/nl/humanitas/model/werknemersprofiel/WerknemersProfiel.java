package nl.humanitas.model.werknemersprofiel;

import nl.humanitas.model.Deelnemer;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class WerknemersProfiel {

    private static final String OMSCHRIJVING_HUMANITAS =
            "Humanitas biedt dagelijks zorg en welzijn voor ouderen. " + "Dat" + " kan alleen met goed gemotiveerde " + "medewerkers, die onze kernwaarden Liefde, Samen en Positief in" + " hun " + "genen hebben. Goede" + " en enthousiaste medewerkers moeten graag bij ons komen werken en bij ons " + "willen " + "blijven omdat ze het naar hun zin hebben. Wij zoeken medewerkers met inlevingsvermogen, " + "creativiteit, " + "betrokkenheid, deskundigheid, hart voor het werk en vooral voor de bewoners. " + "Zie de " + "persoon achter de " + "mens!";
    @Id
    private String id;
    private String omschrijvingWerkplek;
    @OneToOne
    private WerknemerOmschrijving werknemerOmschrijving;

    @OneToOne
    private ProfielOmschrijving profielOmschrijving;
    @ManyToOne
    private Deelnemer deelnemer;

    public WerknemersProfiel() {
    }

    public WerknemersProfiel(String id, String omschrijvingWerkplek, WerknemerOmschrijving werknemerOmschrijving,
                             ProfielOmschrijving profielOmschrijving, String deelnemerId) {
        this.id = id;
        this.omschrijvingWerkplek = omschrijvingWerkplek;
        this.setWerknemerOmschrijving(new WerknemerOmschrijving());
        this.setProfielOmschrijving(new ProfielOmschrijving());
        this.setDeelnemer(new Deelnemer(deelnemerId, "", "", "", "", ""));
    }

    public static String getOmschrijvingHumanitas() {
        return OMSCHRIJVING_HUMANITAS;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOmschrijvingWerkplek() {
        return omschrijvingWerkplek;
    }

    public void setOmschrijvingWerkplek(String omschrijvingWerkplek) {
        this.omschrijvingWerkplek = omschrijvingWerkplek;
    }

    public WerknemerOmschrijving getWerknemerOmschrijving() {
        return werknemerOmschrijving;
    }

    public void setWerknemerOmschrijving(WerknemerOmschrijving werknemerOmschrijving) {
        this.werknemerOmschrijving = werknemerOmschrijving;
    }

    public ProfielOmschrijving getProfielOmschrijving() {
        return profielOmschrijving;
    }

    public void setProfielOmschrijving(ProfielOmschrijving profielOmschrijving) {
        this.profielOmschrijving = profielOmschrijving;
    }

    public Deelnemer getDeelnemer() {
        return deelnemer;
    }

    public void setDeelnemer(Deelnemer deelnemer) {
        this.deelnemer = deelnemer;
    }
}
