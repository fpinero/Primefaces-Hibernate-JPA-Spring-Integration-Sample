package com.journaldev.jpa.data;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Employee {
	
	//JPA provides @Entity which will be used for indicating Employee as a persistent domain class. 
	//Default mapping would be happening in order to map this persistent entity with its Employee 
	//Table. In case you’ve provided Table name or class name that aren’t identical, @Table must be used.

	//@Id annotation used for indicating identity of a given Employee instance. Because of discrepancies between attribute name and column name, @column must be provided.

	//@Column name annotation takes a parameter of mapped column name.
	
	
	@Id
	@Column(name="EMP_ID")
	private long employeeId;
	@Column(name="EMP_NAME")
	private String employeeName;
	@Column(name="EMP_HIRE_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date employeeHireDate;
	@Column(name="EMP_SALARY")
	private double employeeSalary;

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Date getEmployeeHireDate() {
		return employeeHireDate;
	}

	public void setEmployeeHireDate(Date employeeHireDate) {
		this.employeeHireDate = employeeHireDate;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
}
