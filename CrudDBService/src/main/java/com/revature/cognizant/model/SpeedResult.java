package com.revature.cognizant.model;

import java.sql.Timestamp;
import java.time.Duration;

public class SpeedResult {
	
	private Long id;
	private String subjectName;
	private Speed speed;
	private Timestamp experimentTime;
}

class Speed {
	private Duration duration;
	private Distance distance;
}

class Distance {
	private DistanceUnit distanceUnit;
	private Double unit;
}

enum DistanceUnit {
	Millimeters("millimeters"),
	Centimeters("centimeters"),
	Meters("meters"),
	Kilometers("kilometers"),
	Inches("inches"),
	Feet("feet"),
	Yards("yards"),
	Miles("miles");

	DistanceUnit(String string) { }
}
