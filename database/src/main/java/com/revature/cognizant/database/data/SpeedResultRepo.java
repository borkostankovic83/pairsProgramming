package com.revature.cognizant.database.data;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeedResultRepo extends JpaRepository<SpeedResult, Long>{

	Set<SpeedResult> getSpeedResultsBySubjectName(String subjectName);

}
