package com.revature.cognizant.database.service;

import java.util.Set;

import com.revature.cognizant.database.data.Distance;

public interface DistanceService {
	public Distance getDistance(Long id);
	public Set<Distance> getDistances();
	public void deleteDistance(Distance distance);
	public void updateDistance(Distance distance);
	public void newCustomer(Distance distance);
}
