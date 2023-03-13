package com.loc.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class City {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int city_Id;
	private String city_Name;
	private String city_Short_Name;
	
	
	
//	=========================  Location =========================
	@OneToMany(mappedBy = "city", cascade = CascadeType.ALL)
//	@JoinColumn(name = "cl_fk")
	private List<Location> location = new ArrayList<>();
	
//	==========================  State ===========================
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ci_st-fk")
	private State state;
	
	
	
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}

	public City(int city_Id, String city_Name, String city_Short_Name) {
		super();
		this.city_Id = city_Id;
		this.city_Name = city_Name;
		this.city_Short_Name = city_Short_Name;
	}

	public int getCity_Id() {
		return city_Id;
	}

	public void setCity_Id(int city_Id) {
		this.city_Id = city_Id;
	}

	public String getCity_Name() {
		return city_Name;
	}

	public void setCity_Name(String city_Name) {
		this.city_Name = city_Name;
	}

	public String getCity_Short_Name() {
		return city_Short_Name;
	}

	public void setCity_Short_Name(String city_Short_Name) {
		this.city_Short_Name = city_Short_Name;
	}

	public List<Location> getLocation() {
		return location;
	}

	public void setLocation(List<Location> location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "City [city_Id=" + city_Id + ", city_Name=" + city_Name + ", city_Short_Name=" + city_Short_Name + "]";
	}

	
	
	

}
