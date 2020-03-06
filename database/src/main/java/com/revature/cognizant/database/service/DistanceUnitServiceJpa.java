package com.revature.cognizant.database.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.cognizant.database.data.DistanceUnit;
import com.revature.cognizant.database.data.DistanceUnitRepo;

@Service
public class DistanceUnitServiceJpa implements DistanceUnitService {
	@Autowired
	private DistanceUnitRepo distanceUnitRepo;

	@Override
	public DistanceUnit getDistance(String id) {
		return distanceUnitRepo.findById(id).get();
	}

	@Override
	public Set<DistanceUnit> getDistances() {
		return new HashSet<DistanceUnit>(distanceUnitRepo.findAll());
	}

	@Override
	public void deleteDistance(DistanceUnit distanceUnit) {
		distanceUnitRepo.delete(distanceUnit);
	}

	@Override
	public void updateDistance(DistanceUnit distanceUnit) {
		distanceUnitRepo.save(distanceUnit);
	}

	@Override
	public void newCustomer(DistanceUnit distanceUnit) {
		distanceUnitRepo.save(distanceUnit);
	}

}
