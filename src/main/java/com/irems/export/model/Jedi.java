package com.irems.export.model;

import java.math.BigDecimal;

/**
 * A simple Jedi POJO to be exported.
 *
 */
public class Jedi {

	private String name;
	private java.util.Date birthDate;
	private BigDecimal payment;
	private String lightSaberColor;

	public String getName() {
		return name;
	}
	public Jedi setName(String name) {
		this.name = name;
		return this;
	}
	
	public java.util.Date getBirthDate() {
		return birthDate;
	}
	public Jedi setBirthDate(java.util.Date birthDate) {
		this.birthDate = birthDate;
		return this;
	}

	public BigDecimal getPayment() {
		return payment;
	}
	public Jedi setPayment(BigDecimal payment) {
		this.payment = payment;
		return this;
	}

	public String getLightSaberColor() {
		return lightSaberColor;
	}
	public Jedi setLightSaberColor(String lightSaberColor) {
		this.lightSaberColor = lightSaberColor;
		return this;
	}
}
