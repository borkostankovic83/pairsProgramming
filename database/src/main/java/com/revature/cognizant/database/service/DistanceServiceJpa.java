package com.revature.cognizant.database.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.cognizant.database.data.Distance;
import com.revature.cognizant.database.data.DistanceRepo;

@Service
public class DistanceServiceJpa implements DistanceService {
	@Autowired
	private DistanceRepo distanceRepo;

	@Override
	public Distance getDistance(Long id) {
		return distanceRepo.findById(id).get();
	}

	@Override
	public Set<Distance> getDistances() {
		return new HashSet<Distance>(distanceRepo.findAll());
	}

	@Override
	public void deleteDistance(Distance distance) {
		distanceRepo.delete(distance);
	}

	@Override
	public void updateDistance(Distance distance) {
		distanceRepo.save(distance);
	}

	@Override
	public void newCustomer(Distance distance) {
		distanceRepo.save(distance);
	}

}
