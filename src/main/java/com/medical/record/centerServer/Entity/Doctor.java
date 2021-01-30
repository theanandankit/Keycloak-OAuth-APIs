package com.medical.record.centerServer.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Doctor {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int age;
	@OneToOne
	private PersonalInfo personalInfo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public PersonalInfo getPersonalInfo() {
		return personalInfo;
	}

	public void setPersonalInfo(PersonalInfo personalInfo) {
		this.personalInfo = personalInfo;
	}
}
