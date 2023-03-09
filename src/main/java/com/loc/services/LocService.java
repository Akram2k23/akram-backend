package com.loc.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.loc.entities.Country;
import com.loc.repositories.CountryRepo;

@Service
public class LocService {
	
	@Autowired
	private CountryRepo countryRepo;
	
	
	public void saveData(List<Country> countryData) {
		countryRepo.saveAll(countryData);
		
	}
	
	
	public Iterable<Country> getData() {
		Iterable<Country> country = countryRepo.findAll();
		return country;
		
	}

}
