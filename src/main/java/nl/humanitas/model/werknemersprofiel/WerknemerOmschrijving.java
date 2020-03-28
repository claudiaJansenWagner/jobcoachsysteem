package nl.humanitas.model.werknemersprofiel;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class WerknemerOmschrijving {

    @Id
    private String id;
    private String omschrijvingWerknemer;
    private String woonsituatie;
    private String omschrijvingAcademie;
    private String intrinsiekeMotivatie;
    private String valkuilen;
    private String growModel;

    public WerknemerOmschrijving() {
    }

    public WerknemerOmschrijving(String omschrijvingWerknemer, String woonsituatie, String omschrijvingAcademie,
                                 String intrinsiekeMotivatie, String valkuilen, String growModel) {
        this.omschrijvingWerknemer = omschrijvingWerknemer;
        this.woonsituatie = woonsituatie;
        this.omschrijvingAcademie = omschrijvingAcademie;
        this.intrinsiekeMotivatie = intrinsiekeMotivatie;
        this.valkuilen = valkuilen;
        this.growModel = growModel;
    }

    public String getOmschrijvingWerknemer() {
        return omschrijvingWerknemer;
    }

    public void setOmschrijvingWerknemer(String omschrijvingWerknemer) {
        this.omschrijvingWerknemer = omschrijvingWerknemer;
    }

    public String getWoonsituatie() {
        return woonsituatie;
    }

    public void setWoonsituatie(String woonsituatie) {
        this.woonsituatie = woonsituatie;
    }

    public String getOmschrijvingAcademie() {
        return omschrijvingAcademie;
    }

    public void setOmschrijvingAcademie(String omschrijvingAcademie) {
        this.omschrijvingAcademie = omschrijvingAcademie;
    }

    public String getIntrinsiekeMotivatie() {
        return intrinsiekeMotivatie;
    }

    public void setIntrinsiekeMotivatie(String intrinsiekeMotivatie) {
        this.intrinsiekeMotivatie = intrinsiekeMotivatie;
    }

    public String getValkuilen() {
        return valkuilen;
    }

    public void setValkuilen(String valkuilen) {
        this.valkuilen = valkuilen;
    }

    public String getGrowModel() {
        return growModel;
    }

    public void setGrowModel(String growModel) {
        this.growModel = growModel;
    }

}
