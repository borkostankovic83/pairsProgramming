package com.revature.cognizant.aggregatedService.conroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.cognizant.model.SpeedResult;


@RestController
@RequestMapping(value = "/api/experiment")
public class AggregatedController {
	
	@Autowired
	private SpeedResult speedResult;
	
	@GetMapping
	public ResponseEntity<SpeedResult> getExperiment(@PathVariable("subjectName") String subjectName, @PathVariable("convertTo") String convertTo) {
		// get this information from the DB CRUD service
		
		return ResponseEntity.ok(speedResult);
	}
	
	@PostMapping
	public ResponseEntity<SpeedResult> postExperiment(@RequestBody SpeedResult result) {
		// post this information to the DB CRUD service
		
		return ResponseEntity.status(201).body(speedResult);
	}
}
