package com.loc.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Location {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int locationId;
	private String address;
	
	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "lo_ci-fk", referencedColumnName = "city_Id")
//	private City city;
	
	
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Location(int locationId, String address) {
		super();
		this.locationId = locationId;
		this.address = address;
	}


	/**
	 * @return the locationId
	 */
	public int getLocationId() {
		return locationId;
	}


	/**
	 * @param locationId the locationId to set
	 */
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}


	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}


	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", address=" + address + "]";
	}
	
	

}
