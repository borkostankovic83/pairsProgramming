package com.revature.cognizant.database.data;

import java.time.Duration;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class Speed {

	private Duration duration;
	@Embedded
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
