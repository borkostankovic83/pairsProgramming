package com.revature.cognizant.database.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.cognizant.database.data.SpeedResult;
import com.revature.cognizant.database.service.SpeedResultService;

@RestController
@RequestMapping(value="/api/experiment",
	method={RequestMethod.GET, RequestMethod.POST})
public class DatabaseController {
	@Autowired
	private SpeedResultService speedResultService;
	
	@PostMapping
	public ResponseEntity<SpeedResult> postSpeedResult(@RequestBody SpeedResult speedResult) {
		return ResponseEntity.status(201).body(speedResultService.newSpeedResult(speedResult));
	}
	
	@GetMapping("{subjectName}")
	public ResponseEntity<Set<SpeedResult>> getSpeedResult(@RequestParam("subjectName") String subjectName) {
		return ResponseEntity.ok().body(speedResultService.getSpeedResultsBySubjectName(subjectName));
	}
}
