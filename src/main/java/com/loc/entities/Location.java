package com.loc.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Location {
	
	@Id
	private int locationId;
	private String address;
	
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Location(int locationId, String address) {
		super();
		this.locationId = locationId;
		this.address = address;
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

	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", address=" + address + "]";
	}
	
	

}
