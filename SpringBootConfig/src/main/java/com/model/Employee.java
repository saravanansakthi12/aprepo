package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="employeedetails")
@Component
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="empId")
	private int empId;
	@Column(name="empName")
	private String empName;
	@Column(name="empPlace")
	private String empPlace;
	@Column(name="phoneNo")
	private long phoneNo;
	
	public Employee() {
		super();
	}

	public Employee(int empId, String empName, String empPlace, long phoneNo) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empPlace = empPlace;
		this.phoneNo = phoneNo;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpPlace() {
		return empPlace;
	}

	public void setEmpPlace(String empPlace) {
		this.empPlace = empPlace;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
}
