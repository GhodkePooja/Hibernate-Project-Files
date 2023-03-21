package com.Practise.One_to_many_many_to_one;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Standard_10th {
@Id	
private int roll_no;
private String name;
private int age;

@ManyToOne
private City city;
public Standard_10th(int roll_no, String name, int age) {
	super();
	this.roll_no = roll_no;
	this.name = name;
	this.age = age;
}
public Standard_10th() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Standard_10th [roll_no=" + roll_no + ", name=" + name + ", age=" + age + "]";
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
public City getCity() {
	return city;
}
public void setCity(City city) {
	this.city = city;
}


}
