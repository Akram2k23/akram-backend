package com.loc.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.loc.entities.Country;
import com.loc.entities.State;
import com.loc.services.LocService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class LocController {
	
	@Autowired
	private LocService locService;
	
	
	@PostMapping("/savealldata")
	public ResponseEntity<String> saveData(@RequestBody List<Country> country) {
//		System.out.println(country.toString());
		locService.saveData(country);
		
		return ResponseEntity.ok("Data Saved");
	}
	
	
	@GetMapping("/getalldata")
	public Iterable<Country> getData() {
//		System.out.println(country.toString());
		Iterable<Country> country = locService.getData();
		
		return country;
	}
	
	
	@GetMapping("/getbyid/{id}")
	public Optional<Country> getById(@PathVariable("id") int id) {
//		System.out.println(country.toString());
		Optional<Country> country = locService.getById(id);
		 
		return country;
	}
	
	
	@GetMapping("/getallcountry")
	public Iterable<Country> getCountry() {
		
		Iterable<Country> country = locService.getCountry();
		
		return country;
	}
	
	@GetMapping("/getstatebycountryid/{countryid}")
	public List<State> getStateByCountryId(@PathVariable("countryid") int countryid) {
		System.out.println("-------------- countryid ------" +countryid); 
//		List<State> state = locService.getAllState();
//		return state;
		
		return null;
	}
	

	
	@GetMapping("/getallstate")
	public List<State> getAllState() {
		
		List<State> state = locService.getAllState();
		
		return state;
	}
	
	
	
	
	@GetMapping("/getallcity")
	public Iterable<Country> getCity() {
		
		Iterable<Country> country = locService.getCity();
		
		return country;
	}
	
	
	@GetMapping("/getalllocation")
	public Iterable<Country> getLocation() {
		
		Iterable<Country> country = locService.getLocation();
		
		return country;
	}
	
	
//	@GetMapping("/getindiastate")
//	public Iterable<State> getindiaState() {
//		
//		Iterable<State> state = locService.getindiaState();
//		
//		return state;
//	}
	
	
	
	
	
	
	
	
	
	
	
}
