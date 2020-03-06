package com.revature.cognizant.database.data;

public enum DistanceUnit {

	Millimeters("millimeters"),
	Centimeters("centimeters"),
	Meters("meters"),
	Kilometers("kilometers"),
	Inches("inches"),
	Feet("feet"),
	Yards("yards"),
	Miles("miles");
	
	private String distanceUnit;

	DistanceUnit(String distanceUnit) {
		this.distanceUnit = distanceUnit;
	}
	
	public String distanceUnit() {
		return distanceUnit;
	}
}
