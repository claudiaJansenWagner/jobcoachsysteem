package nl.humanitas.model.contract;

import nl.humanitas.model.Deelnemer;

import javax.persistence.*;

@Entity
public class Contract {

    @Id
    private String nummer;
    private String begindatum;
    private String einddatum;

    @Enumerated(EnumType.STRING)
    private Niveau niveau;
    @ManyToOne
    private Deelnemer deelnemer;

    public Contract() {

    }

    public Contract(String id, String deelnemerId, String beginDatum, String eindDatum, Niveau niveau) {
        super();
        this.nummer = id;
        this.begindatum = beginDatum;
        this.einddatum = eindDatum;
        this.niveau = niveau;
        this.setDeelnemer(new Deelnemer(deelnemerId, "", "", "", "", ""));
    }

    public String getId() {
        return nummer;
    }

    public void setId(String id) {
        this.nummer = id;
    }

    public String getBeginDatum() {
        return begindatum;
    }

    public void setBeginDatum(String beginDatum) {
        this.begindatum = beginDatum;
    }

    public String getEindDatum() {
        return einddatum;
    }

    public void setEindDatum(String eindDatum) {
        this.einddatum = eindDatum;
    }

    public String getNiveau() {
        return niveau.toString();
    }

    public void setNiveau(Niveau niveau) {
        this.niveau = niveau;
    }

    public Deelnemer getDeelnemer() {
        return deelnemer;
    }

    public void setDeelnemer(Deelnemer deelnemer) {
        this.deelnemer = deelnemer;
    }

}
