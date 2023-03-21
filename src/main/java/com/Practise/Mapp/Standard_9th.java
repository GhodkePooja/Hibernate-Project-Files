package com.Practise.Mapp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Standard_9th {
     @Id
	private int roll_no;
	private String name;
	private int age;
	
    @OneToOne
    @JoinColumn(name="CITY_ID")
	private City city;

	public Standard_9th() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Standard_9th(int roll_no, String name, int age) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Standard_9th [roll_no=" + roll_no + ", name=" + name + ", age=" + age + "]";
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
