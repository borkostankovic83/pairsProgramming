package com.revature.cognizant.database.service;

import java.util.Set;

import com.revature.cognizant.database.data.Speed;

public interface SpeedService {
	public Speed getDistance(Long id);
	public Set<Speed> getDistances();
	public void deleteDistance(Speed speed);
	public void updateDistance(Speed speed);
	public void newCustomer(Speed speed);
}
