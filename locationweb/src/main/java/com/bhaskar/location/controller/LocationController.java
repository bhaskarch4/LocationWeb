package com.bhaskar.location.controller;

import java.util.List;
import java.util.Objects;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bhaskar.location.entities.Location;
import com.bhaskar.location.service.LocationService;
import com.bhaskar.location.util.EmailUtil;
import com.bhaskar.location.util.ReportUtil;

@Controller
public class LocationController {
   @Autowired
	LocationService service;
   
   @Autowired
   EmailUtil mailSender;
   
   @Autowired
   ServletContext context;
   
   @Autowired
   ReportUtil report;
	@RequestMapping("/location")
	public String showCreate()
	{
		
		return "createLocation";
	}
	
	
	@RequestMapping("/saveLoc")
	public String saveLocation(@ModelAttribute("location") Location location,ModelMap modelMap) {
	  Location  locationSaved =service.createLocation(location);
	  String msg= "successfully saved location with id  "+locationSaved.getId();
		modelMap.addAttribute("msg", msg);
		mailSender.sendMail("bhaskarch4@gmail.com", "mail from spring boot", "new location created with details"+location);
		return "createLocation";
	}
	
	@RequestMapping("/displayLocations")
	public String getLocations(ModelMap modelMap) {
		List<Location> locations = service.getAllLocation();
		modelMap.addAttribute("locations", locations);
		return "displayLocations";
	}
	
	@RequestMapping("/deleteLocation")
	public String deleteLocationById(@RequestParam("id") int id,ModelMap modelMap) {
		
		service.deleteLocation(id);
		List<Location> locations = service.getAllLocation();
		modelMap.addAttribute("locations", locations);
		modelMap.addAttribute("msg","record with id "+id+" successfully deleted");
		return "displayLocations";
	}
	
	@RequestMapping("/updateLocation")
	public String updateLocaction( @RequestParam("id") int id, ModelMap modelMap  ) {
		Location location= service.getLocationById(id);
		modelMap.addAttribute("location", location);
		return "updateLocation";
	}
	@RequestMapping("/saveEditLocation")
	public String saveEditLocations(@ModelAttribute("location") Location location,ModelMap modelMap) {
	    Location updatedLocation = service.updateLocation(location);
	    String msg= "record with id  "+updatedLocation.getId()+"updated scuccessfully";
	    modelMap.addAttribute("msg", msg);
		
		List<Location> locations = service.getAllLocation();
		modelMap.addAttribute("locations", locations);
		return "displayLocations";
	}
	/*
	@RequestMapping("/genaratePieChart")
	public String genaratePieChart() {
		
		List<Object[]> data=service.getLocationChartData();
		String path=context.getRealPath("/");
		
		report.createPieChart(path, data);
		return "report";
	}
	*/
	
	
}
