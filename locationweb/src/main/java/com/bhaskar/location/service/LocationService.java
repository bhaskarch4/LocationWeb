package com.bhaskar.location.service;

import java.util.List;

import com.bhaskar.location.entities.Location;

public interface LocationService {

	Location createLocation(Location location);
	
	Location updateLocation(Location location);
	
	void deleteLocation(long id);
	
	List<Location> getAllLocation();
	
	Location getLocationById(long id);

/*	List<Object[]> getLocationChartData(); */
	
	
}
