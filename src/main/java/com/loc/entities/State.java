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
import jakarta.persistence.Table;

@Entity
public class State {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int s_Id;
	private String s_Name;
	private String s_Short_Name;
	
//	===========================  City ==========================
	@OneToMany(mappedBy = "state", cascade = CascadeType.ALL)
//	@JoinColumn(name = "st_ci-fk")
	private List<City> city = new ArrayList<>();
	
//	============  Country ===============
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "st_co-fk")
	private Country country;
	
	
	public State() {
		super();
		// TODO Auto-generated constructor stub
	}

	public State(int s_Id, String s_Name, String s_Short_Name) {
		super();
		this.s_Id = s_Id;
		this.s_Name = s_Name;
		this.s_Short_Name = s_Short_Name;
	}

	public int getS_Id() {
		return s_Id;
	}

	public void setS_Id(int s_Id) {
		this.s_Id = s_Id;
	}

	public String getS_Name() {
		return s_Name;
	}

	public void setS_Name(String s_Name) {
		this.s_Name = s_Name;
	}

	public String getS_Short_Name() {
		return s_Short_Name;
	}

	public void setS_Short_Name(String s_Short_Name) {
		this.s_Short_Name = s_Short_Name;
	}

	public List<City> getCity() {
		return city;
	}

	public void setCity(ArrayList<City> city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "State [s_Id=" + s_Id + ", s_Name=" + s_Name + ", s_Short_Name=" + s_Short_Name + ", city=" + city + "]";
	}

	
	

}
