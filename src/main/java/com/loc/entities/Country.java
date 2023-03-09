package com.loc.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
public class Country {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int c_Id;
	private String c_Name;
	private String c_Short_Name;
	
	@OneToMany(targetEntity = State.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "cs_fk", referencedColumnName = "c_id")
	private List<State> state = new ArrayList<>();
	
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Country(int c_Id, String c_Name, String c_Short_Name) {
		super();
		this.c_Id = c_Id;
		this.c_Name = c_Name;
		this.c_Short_Name = c_Short_Name;
	}

	public int getC_Id() {
		return c_Id;
	}

	public void setC_Id(int c_Id) {
		this.c_Id = c_Id;
	}

	public String getC_Name() {
		return c_Name;
	}

	public void setC_Name(String c_Name) {
		this.c_Name = c_Name;
	}

	public String getC_Short_Name() {
		return c_Short_Name;
	}

	public void setC_Short_Name(String c_Short_Name) {
		this.c_Short_Name = c_Short_Name;
	}

	public List<State> getState() {
		return state;
	}

	public void setState(ArrayList<State> state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Country [c_Id=" + c_Id + ", c_Name=" + c_Name + ", c_Short_Name=" + c_Short_Name + ", state=" + state
				+ "]";
	}
	
	
	
}
