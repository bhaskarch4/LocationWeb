package com.bhaskar.location.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhaskar.location.entities.Location;
import com.bhaskar.location.repos.LocationRepository;


@Service
public class LocationServiceImpl implements LocationService {
 
    @Autowired
	private LocationRepository repository;
	
	@Override
	public Location createLocation(Location location) {
		
		return repository.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		return repository.save(location);
	}

	@Override
	public void deleteLocation(long id) {
		repository.deleteById(id);
	}

	@Override
	public List<Location> getAllLocation() {
		
		return repository.findAll();
	}

	@Override
	public Location getLocationById(long id) {
		
		return repository.getOne(id);
	}
	 /*
	public List<Object[]> getLocationChartData() {
		
		return repository.findTypeAndTypeCount();
	}
 */
}
