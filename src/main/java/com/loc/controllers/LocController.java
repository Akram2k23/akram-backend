package com.loc.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.loc.entities.Country;
import com.loc.services.LocService;

@RestController
public class LocController {
	
	@Autowired
	private LocService locService;
	
	
	@PostMapping("/save")
	public ResponseEntity<String> saveData(@RequestBody List<Country> country) {
		System.out.println(country.toString());
		locService.saveData(country);
		
		return ResponseEntity.ok("Data Saved");
	}
	
	
	@GetMapping("/get")
	public Iterable<Country> getData() {
//		System.out.println(country.toString());
		Iterable<Country> country = locService.getData();
		
		return country;
	}
	
	
	
	
	
	
}
