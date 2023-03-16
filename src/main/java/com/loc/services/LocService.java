package com.loc.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loc.entities.Country;
import com.loc.entities.State;
import com.loc.repositories.CountryRepo;
import com.loc.repositories.StateRepo;

@Service
public class LocService {

	@Autowired
	private CountryRepo countryRepo;

	@Autowired
	private StateRepo stateRepo;

	public void saveData(List<Country> countryData) {
		countryRepo.saveAll(countryData);

	}

	public Iterable<Country> getData() {
		Iterable<Country> country = countryRepo.findAll();
		return country;

	}

	public Optional<Country> getById(int id) {
		Optional<Country> country = countryRepo.findById(id);
		return country;

	}

	public Iterable<Country> getCountry() {
		Iterable<Country> country = countryRepo.findAll();
		for (Country count : country) {
//			if(count.getC_Id() == 0 && count.getC_Id() == count.getState().get {	
//			}
		}
		return country;
	}

	public List<State> getAllState() {

		List<State> state = stateRepo.findAll(); // hjdf

		return state;
	}

	public Iterable<Country> getCity() {
		Iterable<Country> country = countryRepo.findAll();
		for (Country count : country) {
//			if(count.getC_Id() == 0 && count.getC_Id() == count.getState().get {	
//			}
		}
		return country;
	}

	public Iterable<Country> getLocation() {
		Iterable<Country> country = countryRepo.findAll();
		for (Country count : country) {
//			if(count.getC_Id() == 0 && count.getC_Id() == count.getState().get {	
//			}
		}
		return country;
	}

	public List<State> getStateByCountryId(int countryId) {
		List<State> stateList = stateRepo.findByCountryId(countryId);
		return stateList;
	}

	
	
	
	
//	public List<State> getindiaState() {
//		List<State> sta = new ArrayList<>();
//
//		List<State> state = stateRepo.findAll(); // hjdf
//
//		List<Country> country = countryRepo.findAll();
//
//		for (Country count : country) {
//			if (count.getC_Id() == 1) {
//				for (State stat : state) {
//					sta.add(stat);
////					return sta;
//
//				}
//			}
//
//		}
//
//		return sta;
//	}

}
