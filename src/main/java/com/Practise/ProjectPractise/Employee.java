package com.Practise.ProjectPractise;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee_Details")
public class Employee {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="Employee_Id", length=100)
private int emp_id;

@Column(name="Department")
private String department;

@Column(name="Designation")
private String designation;

@Column(name="Salary")
private double salary;
public Employee(int emp_id, String department, String designation, double salary) {
	super();
	this.emp_id = emp_id;
	this.department = department;
	this.designation = designation;
	this.salary = salary;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public int getEmp_id() {
	return emp_id;
}
public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [emp_id=" + emp_id + ", department=" + department + ", designation=" + designation + ", salary="
			+ salary + "]";
}
}
