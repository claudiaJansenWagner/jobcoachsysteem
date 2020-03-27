package nl.humanitas.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Deelnemer {
	
	@Id
	private String id;
	private String naam;
	private String geboortedatum;
	private String adres;
	private String telefoonnummer;
	private String eMail;
	
	public Deelnemer() {
		
	}
	
	public Deelnemer(String id, String naam, String geboortedatum, String adres, String telefoonnummer, String eMail) {
		super();
		this.id = id;
		this.naam = naam;
		this.geboortedatum = geboortedatum;
		this.adres = adres;
		this.telefoonnummer = telefoonnummer;
		this.eMail = eMail;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public String getGeboortedatum() {
		return geboortedatum;
	}
	public void setGeboortedatum(String geboortedatum) {
		this.geboortedatum = geboortedatum;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public String getTelefoonnummer() {
		return telefoonnummer;
	}
	public void setTelefoonnummer(String telefoonnummer) {
		this.telefoonnummer = telefoonnummer;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
		

}
