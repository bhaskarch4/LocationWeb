package com.bhaskar.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhaskar.location.entities.Location;
import com.bhaskar.location.repos.LocationRepository;
import com.bhaskar.location.service.LocationService;

@RestController
@RequestMapping("/location")
public class LocationRestController {
  
	
	@Autowired
	LocationRepository repository;
	
/*	@GetMapping
	public List<Location> getAllLocation() {
		return repository.findAll() ;
		
	} */
	
	@PostMapping
	public Location saveLocation(@RequestBody Location location) {
		return repository.save(location);
	}
	
	
	@PutMapping
		public Location updateLocation(@RequestBody Location location) {
			return repository.save(location);
	
	}
	@Autowired
	LocationService service;
	@GetMapping("/{id}")
	public Location saveLocationById(@PathVariable("id") int id) {
		return service.getLocationById(id) ;
	
}
}
