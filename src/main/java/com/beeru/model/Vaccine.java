package com.beeru.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vaccine {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String vaccineName;
	
	private String vaccineCompany;
	
	private double cost;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVaccineName() {
		return vaccineName;
	}

	public void setVaccineName(String vaccineName) {
		this.vaccineName = vaccineName;
	}

	public String getVaccineCompany() {
		return vaccineCompany;
	}

	public void setVaccineCompany(String vaccineCompany) {
		this.vaccineCompany = vaccineCompany;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Vaccine [id=" + id + ", vaccineName=" + vaccineName + ", vaccineCompany=" + vaccineCompany + ", cost="
				+ cost + "]";
	}

	public Vaccine( String vaccineName, String vaccineCompany, Double cost) {
		super();
		
		this.vaccineName = vaccineName;
		this.vaccineCompany = vaccineCompany;
		this.cost = cost;
	}

	
	
	

}
