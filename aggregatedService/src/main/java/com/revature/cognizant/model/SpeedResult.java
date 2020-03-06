package com.revature.cognizant.model;

import java.sql.Timestamp;
import java.time.Duration;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class SpeedResult {
	@Id
	private Long id;
	private String subjectName;
	@ManyToOne
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
