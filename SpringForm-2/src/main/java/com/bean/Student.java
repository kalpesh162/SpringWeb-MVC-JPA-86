package com.bean;

import java.util.Arrays;

public class Student {
	private String firstName;
	private String lastName;
	private String gender;
	private String[] courses;
	private int yearOfPass;

	public Student() {

	}

	public Student(String firstName, String lastName, String gender, String[] courses, int yearOfPass) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.courses = courses;
		this.yearOfPass = yearOfPass;
	}

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public int getYearOfPass() {
		return yearOfPass;
	}

	public void setYearOfPass(int yearOfPass) {
		this.yearOfPass = yearOfPass;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", courses="
				+ Arrays.toString(courses) + ", yearOfPass=" + yearOfPass + "]";
	}

}
