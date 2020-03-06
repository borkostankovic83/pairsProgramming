package com.revature.cognizant.database.service;

import java.util.HashSet;
import java.util.List;
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
	public List<SpeedResult> getSpeedResults() {
		return speedResultRepo.findAll();
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
	public List<SpeedResult> getSpeedResultsBySubjectName(String subjectName) {
		return speedResultRepo.getSpeedResultsBySubjectName(subjectName);
	}

}
