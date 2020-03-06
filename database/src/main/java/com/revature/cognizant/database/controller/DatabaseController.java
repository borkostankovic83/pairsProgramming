package com.revature.cognizant.database.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.revature.cognizant.database.service.DistanceService;
import com.revature.cognizant.database.service.DistanceUnitService;
import com.revature.cognizant.database.service.SpeedResultService;
import com.revature.cognizant.database.service.SpeedService;

@RestController
public class DatabaseController {
	@Autowired
	private DistanceService distanceService;
	
	@Autowired
	private DistanceUnitService distanceUnitService;
	
	@Autowired
	private SpeedResultService speedResultService;
	
	@Autowired
	private SpeedService speedService;
	
	
}
