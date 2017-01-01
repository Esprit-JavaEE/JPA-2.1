package com.esprit.jpa.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ConditionDeConservation implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	
	private int temperature;
	
	private float humidite;
	
	@OneToMany
	private List<ProduitAlimentaire> produitAlimentaires;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public float getHumidite() {
		return humidite;
	}

	public void setHumidite(float humidite) {
		this.humidite = humidite;
	}
	
	


	
	

}
