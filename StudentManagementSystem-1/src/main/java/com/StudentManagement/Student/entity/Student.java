package com.StudentManagement.Student.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	private long id;
	private String fname;
	private String lname;
	private String address;
	public Student(long id, String fname, String lname, String address) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", fname=" + fname + ", lname=" + lname + ", address=" + address + 
				"]";
	}
	

}

