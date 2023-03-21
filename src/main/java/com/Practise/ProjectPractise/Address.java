package com.Practise.ProjectPractise;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;


@Entity
@Table(name="Address_Details")
public class Address {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="ADDRESS_ID")
private int address_id;

@Column(name="STATE", length=100, nullable=false)
private String state;

@Column(name="PINCODE",length=6 ,unique=true)
private int pincode;

@Column(name="ABC",columnDefinition = "int default 100")
private int Abc;

@Lob
private byte[] images;
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public Address(int address_id, String state, int pincode, int abc, byte[] images) {
	super();
	this.address_id = address_id;
	this.state = state;
	this.pincode = pincode;
	Abc = abc;
	this.images = images;
}
public int getAddress_id() {
	return address_id;
}
public void setAddress_id(int address_id) {
	this.address_id = address_id;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
public int getAbc() {
	return Abc;
}
public void setAbc(int abc) {
	Abc = abc;
}
public byte[] getImages() {
	return images;
}
public void setImages(byte[] images) {
	this.images = images;
}
@Override
public String toString() {
	return "Address [address_id=" + address_id + ", state=" + state + ", pincode=" + pincode + ", Abc=" + Abc
			+ ", images=" + Arrays.toString(images) + "]";
}
}
