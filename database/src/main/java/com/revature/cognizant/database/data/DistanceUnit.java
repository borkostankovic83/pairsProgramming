package com.revature.cognizant.database.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public enum DistanceUnit {
	Millimeters("millimeters"),
	Centimeters("centimeters"),
	Meters("meters"),
	Kilometers("kilometers"),
	Inches("inches"),
	Feet("feet"),
	Yards("yards"),
	Miles("miles");
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private String distanceUnit;
	
	DistanceUnit(String distanceUnit) {
		this.distanceUnit = distanceUnit;
	}
	
	public String distanceUnit() {
		return distanceUnit;
	}
}
