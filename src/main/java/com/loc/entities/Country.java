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
public class Country {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "feedbackSeq")
	private int c_Id;
	private String c_Name;
	private String c_Short_Name;
	
	@OneToMany (cascade = CascadeType.ALL)
	@JoinColumn(name = "co_st-fk")
	private List<State> state;

	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Country(int c_Id, String c_Name, String c_Short_Name, List<State> state) {
		super();
		this.c_Id = c_Id;
		this.c_Name = c_Name;
		this.c_Short_Name = c_Short_Name;
		this.state = state;
	}

	/**
	 * @return the c_Id
	 */
	public int getC_Id() {
		return c_Id;
	}

	/**
	 * @param c_Id the c_Id to set
	 */
	public void setC_Id(int c_Id) {
		this.c_Id = c_Id;
	}

	/**
	 * @return the c_Name
	 */
	public String getC_Name() {
		return c_Name;
	}

	/**
	 * @param c_Name the c_Name to set
	 */
	public void setC_Name(String c_Name) {
		this.c_Name = c_Name;
	}

	/**
	 * @return the c_Short_Name
	 */
	public String getC_Short_Name() {
		return c_Short_Name;
	}

	/**
	 * @param c_Short_Name the c_Short_Name to set
	 */
	public void setC_Short_Name(String c_Short_Name) {
		this.c_Short_Name = c_Short_Name;
	}

	/**
	 * @return the state
	 */
	public List<State> getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(List<State> state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Country [c_Id=" + c_Id + ", c_Name=" + c_Name + ", c_Short_Name=" + c_Short_Name + ", state=" + state
				+ "]";
	}
	
	
	
	
}
