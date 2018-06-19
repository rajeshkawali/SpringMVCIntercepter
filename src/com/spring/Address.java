package com.spring;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Address {

	@NotNull(message="Please enter the Country")
	private String country;
	
	@NotNull(message="Please enter the State")
	private String state;
	
	@NotNull(message="Please enter the City")
	private String city;
	
	@Min(value=50,message="Pincode should be min 50")
	private int pincode;
	
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
}
