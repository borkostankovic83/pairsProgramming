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
	public SpeedResult getDistance(Long id) {
		return speedResultRepo.findById(id).get();
	}

	@Override
	public Set<SpeedResult> getDistances() {
		return new HashSet<SpeedResult>(speedResultRepo.findAll());
	}

	@Override
	public void deleteDistance(SpeedResult speedResult) {
		speedResultRepo.delete(speedResult);
	}

	@Override
	public void updateDistance(SpeedResult speedResult) {
		speedResultRepo.save(speedResult);
	}

	@Override
	public void newCustomer(SpeedResult speedResult) {
		speedResultRepo.save(speedResult);
	}

}
