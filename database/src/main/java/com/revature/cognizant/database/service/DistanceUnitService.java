package com.revature.cognizant.database.service;

import java.util.Set;

import com.revature.cognizant.database.data.DistanceUnit;

public interface DistanceUnitService {
	public DistanceUnit getDistance(String id);
	public Set<DistanceUnit> getDistances();
	public void deleteDistance(DistanceUnit distanceUnit);
	public void updateDistance(DistanceUnit distanceUnit);
	public void newCustomer(DistanceUnit distanceUnit);
}
