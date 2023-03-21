package com.Practise.Cascading;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Standard_12th {
@Id	
private int roll_no;
private String name;
private int age;

@ManyToOne
private City1 city;

public Standard_12th() {
	super();
	// TODO Auto-generated constructor stub
}

public Standard_12th(int roll_no, String name, int age, City1 city) {
	super();
	this.roll_no = roll_no;
	this.name = name;
	this.age = age;
	this.city = city;
}

public int getRoll_no() {
	return roll_no;
}

public void setRoll_no(int roll_no) {
	this.roll_no = roll_no;
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

public City1 getCity() {
	return city;
}

public void setCity(City1 city) {
	this.city = city;
}}

