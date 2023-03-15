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
public class State {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int s_Id;
	private String s_Name;
	private String s_Short_Name;
	
	@OneToMany (cascade = CascadeType.ALL)
	private int c_Id;	
	
//	===========================  City ==========================
//	@OneToMany (cascade = CascadeType.ALL)
//	@JoinColumn(name = "st_ci-fk")
//	private List<City> city;
	
	
//	============  Country ===============
//	@ManyToOne (cascade = CascadeType.ALL)
//	@JoinColumn(name = "st_co-fk", referencedColumnName = "c_Id")
//	private Country country;

	public State() {
		super();
		// TODO Auto-generated constructor stub
	}

	public State(int s_Id, String s_Name, String s_Short_Name, List<City> city) {
		super();
		this.s_Id = s_Id;
		this.s_Name = s_Name;
		this.s_Short_Name = s_Short_Name;
//		this.city = city;
	}

	/**
	 * @return the s_Id
	 */
	public int getS_Id() {
		return s_Id;
	}

	/**
	 * @param s_Id the s_Id to set
	 */
	public void setS_Id(int s_Id) {
		this.s_Id = s_Id;
	}

	/**
	 * @return the s_Name
	 */
	public String getS_Name() {
		return s_Name;
	}

	/**
	 * @param s_Name the s_Name to set
	 */
	public void setS_Name(String s_Name) {
		this.s_Name = s_Name;
	}

	/**
	 * @return the s_Short_Name
	 */
	public String getS_Short_Name() {
		return s_Short_Name;
	}

	/**
	 * @param s_Short_Name the s_Short_Name to set
	 */
	public void setS_Short_Name(String s_Short_Name) {
		this.s_Short_Name = s_Short_Name;
	}

//	/**
//	 * @return the city
//	 */
//	public List<City> getCity() {
//		return city;
//	}
//
//	/**
//	 * @param city the city to set
//	 */
//	public void setCity(List<City> city) {
//		this.city = city;
//	}

//	@Override
//	public String toString() {
//		return "State [s_Id=" + s_Id + ", s_Name=" + s_Name + ", s_Short_Name=" + s_Short_Name + ", city=" + city + "]";
//	}

	
	

}
