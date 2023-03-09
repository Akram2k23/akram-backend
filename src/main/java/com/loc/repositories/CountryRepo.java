package com.loc.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.loc.entities.Country;

@Repository
public interface CountryRepo extends CrudRepository<Country, Integer> {
//	@Override
	 

}
