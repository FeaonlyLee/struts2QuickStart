package com.struts2.struts2QuickStart.model;

import java.util.Arrays;

public class Person {
	private String firstName;
	private String lastName;
	private String email;
	private int age;
	private String sport;
    private String gender;
    private String residency;
    private boolean over21;
    private String [] carModels;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getResidency() {
		return residency;
	}

	public void setResidency(String residency) {
		this.residency = residency;
	}

	public boolean isOver21() {
		return over21;
	}

	public void setOver21(boolean over21) {
		this.over21 = over21;
	}

	public String[] getCarModels() {
		return carModels;
	}

	public void setCarModels(String[] carModels) {
		this.carModels = carModels;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", age=" + age
				+ ", sport=" + sport + ", gender=" + gender + ", residency=" + residency + ", over21=" + over21
				+ ", carModels=" + Arrays.toString(carModels) + "]";
	}



}
