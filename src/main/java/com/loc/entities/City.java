package com.loc.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class City {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int city_Id;
	private String city_Name;
	private String city_Short_Name;
	
	
	
//	=========================  Location =========================
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "cl_fk")
	private List<Location> location;
	
//	==========================  State ===========================
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "ci_st-fk", referencedColumnName = "s_Id")
//	private State state;



	public City() {
		super();
		// TODO Auto-generated constructor stub
	}

	public City(int city_Id, String city_Name, String city_Short_Name, List<Location> location) {
		super();
		this.city_Id = city_Id;
		this.city_Name = city_Name;
		this.city_Short_Name = city_Short_Name;
		this.location = location;
	}

	/**
	 * @return the city_Id
	 */
	public int getCity_Id() {
		return city_Id;
	}

	/**
	 * @param city_Id the city_Id to set
	 */
	public void setCity_Id(int city_Id) {
		this.city_Id = city_Id;
	}

	/**
	 * @return the city_Name
	 */
	public String getCity_Name() {
		return city_Name;
	}

	/**
	 * @param city_Name the city_Name to set
	 */
	public void setCity_Name(String city_Name) {
		this.city_Name = city_Name;
	}

	/**
	 * @return the city_Short_Name
	 */
	public String getCity_Short_Name() {
		return city_Short_Name;
	}

	/**
	 * @param city_Short_Name the city_Short_Name to set
	 */
	public void setCity_Short_Name(String city_Short_Name) {
		this.city_Short_Name = city_Short_Name;
	}

	/**
	 * @return the location
	 */
	public List<Location> getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(List<Location> location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "City [city_Id=" + city_Id + ", city_Name=" + city_Name + ", city_Short_Name=" + city_Short_Name
				+ ", location=" + location + "]";
	}
	
	
	

}
