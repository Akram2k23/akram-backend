package com.loc.repositories;

import org.springframework.data.repository.CrudRepository;

import com.loc.entities.State;

public interface StateRepo extends CrudRepository<State, Integer> {

}
