package com.spring.orm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Table;

@Entity
@javax.persistence.Table
public class Student {

	@Id
	@Column(name="student_ID")
	private int Studentid;
	@Column(name="student_name")
	private String studentName;
	@Column(name="student_city")
	private String studentCity;
	
	public Student(int studentid, String studentName, String studentCity) {
		super();
		Studentid = studentid;
		this.studentName = studentName;
		this.studentCity = studentCity;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStudentid() {
		return Studentid;
	}

	public void setStudentid(int studentid) {
		Studentid = studentid;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	
	
}
