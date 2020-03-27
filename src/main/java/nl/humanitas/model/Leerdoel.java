package nl.humanitas.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Leerdoel {

	@Id
	private String id;
	private String eersteDoel;
	private String tweedeDoel;
	
	@ManyToOne
	Deelnemer deelnemer;

	Leerdoel() {

	}

	public Leerdoel(String id, String eersteDoel, String tweedeDoel, String deelnemerId) {
		super();
		this.id = id;
		this.eersteDoel = eersteDoel;
		this.tweedeDoel = tweedeDoel;
		this.setDeelnemer(new Deelnemer(deelnemerId, "", "", "", "", ""));
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEersteDoel() {
		return eersteDoel;
	}

	public void setEersteDoel(String eersteDoel) {
		this.eersteDoel = eersteDoel;
	}

	public String getTweedeDoel() {
		return tweedeDoel;
	}

	public void setTweedeDoel(String tweedeDoel) {
		this.tweedeDoel = tweedeDoel;
	}

	public Deelnemer getDeelnemer() {
		return deelnemer;
	}

	public void setDeelnemer(Deelnemer deelnemer) {
		this.deelnemer = deelnemer;
	}

	
}
