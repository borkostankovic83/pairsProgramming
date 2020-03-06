package com.revature.cognizant.database.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.cognizant.database.data.Speed;
import com.revature.cognizant.database.data.SpeedRepo;

@Service
public class SpeedServiceJpa implements SpeedService {
	@Autowired
	private SpeedRepo speedRepo;
	
	@Override
	public Speed getDistance(Long id) {
		return speedRepo.findById(id).get();
	}

	@Override
	public Set<Speed> getDistances() {
		return new HashSet<Speed>(speedRepo.findAll());
	}

	@Override
	public void deleteDistance(Speed speed) {
		speedRepo.delete(speed);
	}

	@Override
	public void updateDistance(Speed speed) {
		speedRepo.save(speed);
	}

	@Override
	public void newCustomer(Speed speed) {
		speedRepo.save(speed);
	}

}
