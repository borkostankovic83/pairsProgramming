package com.revature.cognizant.model;

import java.time.Duration;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.revature.cognizant.model.Distance;

@Entity
public class Speed {
	@Id
	private Integer id;
	private Duration duration;
	@ManyToOne
	private Distance distance;
	public Speed() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
