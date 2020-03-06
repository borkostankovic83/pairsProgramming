package com.revature.cognizant.database.data;

import java.sql.Timestamp;
import java.util.Objects;

import javax.persistence.Embedded;
import javax.persistence.Entity;
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
