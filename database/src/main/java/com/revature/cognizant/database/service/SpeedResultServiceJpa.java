package com.revature.cognizant.database.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.cognizant.database.data.SpeedResult;
import com.revature.cognizant.database.data.SpeedResultRepo;

@Service
public class SpeedResultServiceJpa implements SpeedResultService {
	@Autowired
	private SpeedResultRepo speedResultRepo;

	@Override
	public SpeedResult getSpeedResult(Long id) {
		return speedResultRepo.findById(id).get();
	}

	@Override
	public Set<SpeedResult> getSpeedResults() {
		return new HashSet<SpeedResult>(speedResultRepo.findAll());
	}

	@Override
	public void deleteSpeedResult(SpeedResult speedResult) {
		speedResultRepo.delete(speedResult);
	}

	@Override
	public SpeedResult updateSpeedResult(SpeedResult speedResult) {
		return speedResultRepo.save(speedResult);
	}

	@Override
	public SpeedResult newSpeedResult(SpeedResult speedResult) {
		return speedResultRepo.save(speedResult);
	}

	@Override
	public Set<SpeedResult> getSpeedResultsBySubjectName(String subjectName) {
		return speedResultRepo.getSpeedResultsBySubjectName(subjectName);
	}

}
