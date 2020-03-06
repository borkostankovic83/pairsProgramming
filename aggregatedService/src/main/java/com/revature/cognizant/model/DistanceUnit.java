package com.revature.cognizant.model;

import javax.persistence.Entity;
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
	private String distanceUnit;
	
	DistanceUnit(String distanceUnit) {
		this.distanceUnit = distanceUnit;
	}
	
	public String distanceUnit() {
		return distanceUnit;
	}
}
