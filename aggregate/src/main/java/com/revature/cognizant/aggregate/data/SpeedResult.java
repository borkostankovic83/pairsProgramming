package com.revature.cognizant.aggregate.data;

import java.sql.Timestamp;
import java.time.Duration;
import java.util.Objects;

public class SpeedResult {
	private Long id;
	private String subjectName;
	private Speed speed;
	private Timestamp experimentTime;
	public SpeedResult() {
		super();
	}
	public SpeedResult(Long id, String subjectName, Speed speed, Timestamp experimentTime) {
		super();
		this.id = id;
		this.subjectName = subjectName;
		this.speed = speed;
		this.experimentTime = experimentTime;
	}
	public SpeedResult(Long id, String subjectName, Duration duration, Distance distance, Timestamp experimentTime) {
		this(id, subjectName, new Speed(duration, distance), experimentTime);
	}
	public SpeedResult(Long id, String subjectName, Duration duration, DistanceUnit distanceUnit, Double unit, Timestamp experimentTime) {
		this(id, subjectName, new Speed(duration, new Distance(distanceUnit, unit)), experimentTime);
	}
	public SpeedResult(Long id, String subjectName, Duration duration, String distanceUnit, Double unit, Timestamp experimentTime) {
		this(id, subjectName, new Speed(duration, new Distance(DistanceUnit.valueOf(distanceUnit), unit)), experimentTime);
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public Speed getSpeed() {
		return speed;
	}
	public void setSpeed(Speed speed) {
		this.speed = speed;
	}
	public Timestamp getExperimentTime() {
		return experimentTime;
	}
	public void setExperimentTime(Timestamp experimentTime) {
		this.experimentTime = experimentTime;
	}
	@Override
	public int hashCode() {
		return Objects.hash(experimentTime, id, speed, subjectName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof SpeedResult))
			return false;
		SpeedResult other = (SpeedResult) obj;
		return Objects.equals(experimentTime, other.experimentTime) && Objects.equals(id, other.id)
				&& Objects.equals(speed, other.speed) && Objects.equals(subjectName, other.subjectName);
	}
	@Override
	public String toString() {
		return "SpeedResult [id=" + id + ", subjectName=" + subjectName + ", speed=" + speed + ", experimentTime="
				+ experimentTime + "]";
	}
	
	
}

class Speed {
	private Duration duration;
	private Distance distance;
	public Speed() {
		super();
	}
	public Speed(Duration duration, Distance distance) {
		super();
		this.duration = duration;
		this.distance = distance;
	}
	public Duration getDuration() {
		return duration;
	}
	public void setDuration(Duration duration) {
		this.duration = duration;
	}
	public Distance getDistance() {
		return distance;
	}
	public void setDistance(Distance distance) {
		this.distance = distance;
	}
	@Override
	public int hashCode() {
		return Objects.hash(distance, duration);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Speed))
			return false;
		Speed other = (Speed) obj;
		return Objects.equals(distance, other.distance) && Objects.equals(duration, other.duration);
	}
	@Override
	public String toString() {
		return "Speed [duration=" + duration + ", distance=" + distance + "]";
	}
}

class Distance {
	private DistanceUnit distanceUnit;
	private Double unit;
	public Distance() {
		super();
	}
	public Distance(DistanceUnit distanceUnit, Double unit) {
		super();
		this.distanceUnit = distanceUnit;
		this.unit = unit;
	}
	public DistanceUnit getDistanceUnit() {
		return distanceUnit;
	}
	public void setDistanceUnit(DistanceUnit distanceUnit) {
		this.distanceUnit = distanceUnit;
	}
	public Double getUnit() {
		return unit;
	}
	public void setUnit(Double unit) {
		this.unit = unit;
	}
	@Override
	public int hashCode() {
		return Objects.hash(distanceUnit, unit);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Distance))
			return false;
		Distance other = (Distance) obj;
		return distanceUnit == other.distanceUnit && Objects.equals(unit, other.unit);
	}
	@Override
	public String toString() {
		return "Distance [distanceUnit=" + distanceUnit + ", unit=" + unit + "]";
	}
	
	
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
	
	private String distanceUnit;
	
	DistanceUnit(String distanceUnit) {
		this.distanceUnit = distanceUnit;
	}
	
	public String distanceUnit() {
		return distanceUnit;
	}
}
