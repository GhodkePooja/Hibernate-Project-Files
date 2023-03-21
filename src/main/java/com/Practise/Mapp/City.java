package com.Practise.Mapp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class City {
    @Id
	private int cid;
	private String cityName;
	
	@OneToOne
	@JoinColumn(name="STANDARD_9TH")
	private Standard_9th std;
	
	public City(int cid, String cityName) {
		super();
		this.cid = cid;
		this.cityName = cityName;
	}
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	@Override
	public String toString() {
		return "City [cid=" + cid + ", cityName=" + cityName + "]";
	}
	public Standard_9th getStd() {
		return std;
	}
	public void setStd(Standard_9th std) {
		this.std = std;
	}
}
