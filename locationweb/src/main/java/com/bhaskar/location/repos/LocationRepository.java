package com.bhaskar.location.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bhaskar.location.entities.ChartData;
import com.bhaskar.location.entities.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
	
	/*	
	

@Query(value = "select type,count(type) from location group by type") 
	public List<ChartData> findTypeAndTypeCount();  */
	
	
}
