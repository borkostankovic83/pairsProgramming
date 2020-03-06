package com.revature.cognizant.database.service;

import java.util.Set;

import com.revature.cognizant.database.data.SpeedResult;

public interface SpeedResultService {
	public SpeedResult getSpeedResult(Long id);
	public Set<SpeedResult> getSpeedResults();
	public void deleteSpeedResult(SpeedResult speedResult);
	public SpeedResult updateSpeedResult(SpeedResult speedResult);
	public SpeedResult newSpeedResult(SpeedResult speedResult);
	public Set<SpeedResult> getSpeedResultsBySubjectName(String subjectName);

}
