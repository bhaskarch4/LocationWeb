package com.bhaskar.location;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bhaskar.location.repos.LocationRepository;
import com.bhaskar.location.service.LocationServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LocationwebApplicationTests {

    @Autowired
	LocationServiceImpl service;
  
    @Autowired
    LocationRepository repository;
    
	@Test
	public void repositoryTest() {
		
		
		service.getLocationById(3);
	}

}
