package com.loc.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Location {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int locationId;
	private String address;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "lo_ci-fk", referencedColumnName = "city_Id")
	private City city;

	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Location(int locationId, String address, City city) {
		super();
		this.locationId = locationId;
		this.address = address;
		this.city = city;
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", address=" + address + ", city=" + city + "]";
	}
	
	

}
