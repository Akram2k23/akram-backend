package com.loc.repositories;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.loc.entities.State;

public interface StateRepo extends JpaRepository<State, Integer> {
	
//	public abstract State getStateById(int id);


	
}
