package com.Practise.Cascading;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class City1 {
	@Id
private int cid;
private String city;

@OneToMany(mappedBy="city" , fetch=FetchType.LAZY, cascade= CascadeType.ALL)
private List<Standard_12th>std;

public City1() {
	super();
	// TODO Auto-generated constructor stub
}

public City1(int cid, String city, List<Standard_12th> std) {
	super();
	this.cid = cid;
	this.city = city;
	this.std = std;
}

public int getCid() {
	return cid;
}

public void setCid(int cid) {
	this.cid = cid;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public List<Standard_12th> getStd() {
	return std;
}

public void setStd(List<Standard_12th> std) {
	this.std = std;
}


}
