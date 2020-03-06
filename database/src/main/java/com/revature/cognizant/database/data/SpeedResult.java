package com.revature.cognizant.database.data;

import java.sql.Timestamp;
import java.time.Duration;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class SpeedResult {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="speed_result")
	@SequenceGenerator(name="speed_result", sequenceName="speed_result_seq", allocationSize=1)
	private Long id;
	private String subjectName;
	@Embedded
	private Speed speed;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Timestamp experimentTime;
	public SpeedResult() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SpeedResult(Long id, String subjectName, Speed speed, Timestamp experimentTime) {
		super();
		this.id = id;
		this.subjectName = subjectName;
		this.speed = speed;
		this.experimentTime = experimentTime;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSubjustName() {
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

@Embeddable
class Speed {
	private Duration duration;
	@Embedded
	private Distance distance;
	public Speed() {
		super();
	}
	public Speed(Long id, Duration duration, Distance distance) {
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

@Embeddable
class Distance {
	@Enumerated(EnumType.STRING)
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
