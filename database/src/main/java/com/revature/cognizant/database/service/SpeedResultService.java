package com.revature.cognizant.database.service;

import java.util.Set;

import com.revature.cognizant.database.data.SpeedResult;

public interface SpeedResultService {
	public SpeedResult getDistance(Long id);
	public Set<SpeedResult> getDistances();
	public void deleteDistance(SpeedResult speedResult);
	public void updateDistance(SpeedResult speedResult);
	public void newCustomer(SpeedResult speedResult);

}
