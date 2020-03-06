package com.revature.cognizant.aggregate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.revature.cognizant.aggregate.services.AggregateService;

@RestController
public class AggregateController {
	@Autowired
	private AggregateService aggregateService;

}
