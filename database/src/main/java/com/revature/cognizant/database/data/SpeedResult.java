package com.revature.cognizant.database.data;

import java.sql.Timestamp;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class SpeedResult {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="speed_result")
	@SequenceGenerator(name="speed_result", sequenceName="speed_result_seq", allocationSize=1)
	private Long id;
	private String subjustName;
	@ManyToOne
	private Speed speed;
	private Timestamp experimentTime;
	public SpeedResult() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SpeedResult(Long id, String subjustName, Speed speed, Timestamp experimentTime) {
		super();
		this.id = id;
		this.subjustName = subjustName;
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
		return subjustName;
	}
	public void setSubjustName(String subjustName) {
		this.subjustName = subjustName;
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
		return Objects.hash(experimentTime, id, speed, subjustName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof SpeedResult))
			return false;
		SpeedResult other = (SpeedResult) obj;
		return Objects.equals(experimentTime, other.experimentTime) && Objects.equals(id, other.id)
				&& Objects.equals(speed, other.speed) && Objects.equals(subjustName, other.subjustName);
	}
	@Override
	public String toString() {
		return "SpeedResult [id=" + id + ", subjustName=" + subjustName + ", speed=" + speed + ", experimentTime="
				+ experimentTime + "]";
	}
	
	
}
