package com.spring;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student {

	@Pattern(regexp="[^0-9]*",message="Name should be Alphabatics only")
	private String sName;
	
	@Size(min=2,max=20, message="Please enter the valid Hobby field between {min} and {max} charachter")
	private String sHobby;
	
	@NotNull(message="Please enter the sGender")
	private ArrayList<String> sGender;
	
	
	@Max(value=9999,message="Mobile Number greater than 1111")
	private Long sMobile;
	
	@Future(message="Date should be in future")
	private Date sDob;
	
	private ArrayList<String> sSkills;
	
	private Address sAddress;
	
	public Address getsAddress() {
		return sAddress;
	}
	public void setsAddress(Address sAddress) {
		this.sAddress = sAddress;
	}
	public ArrayList<String> getsGender() {
		return sGender;
	}
	public void setsGender(ArrayList<String> sGender) {
		this.sGender = sGender;
	}
	public Long getsMobile() {
		return sMobile;
	}
	public void setsMobile(Long sMobile) {
		this.sMobile = sMobile;
	}
	public Date getsDob() {
		return sDob;
	}
	public void setsDob(Date sDob) {
		this.sDob = sDob;
	}
	public ArrayList<String> getsSkills() {
		return sSkills;
	}
	public void setsSkills(ArrayList<String> sSkills) {
		this.sSkills = sSkills;
	}
		
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsHobby() {
		return sHobby;
	}
	public void setsHobby(String sHobby) {
		this.sHobby = sHobby;
	}
	
	
	
}
