package com.revature.cognizant.database.data;

import java.time.Duration;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Speed {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="speed")
	@SequenceGenerator(name="speed", sequenceName="speed_seq", allocationSize=1)
	private Long id;
	private Duration duration;
	@ManyToOne
	private Distance distance;
	public Speed() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Speed(Long id, Duration duration, Distance distance) {
		super();
		this.id = id;
		this.duration = duration;
		this.distance = distance;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
		return Objects.hash(distance, duration, id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Speed))
			return false;
		Speed other = (Speed) obj;
		return Objects.equals(distance, other.distance) && Objects.equals(duration, other.duration)
				&& Objects.equals(id, other.id);
	}
	@Override
	public String toString() {
		return "Speed [id=" + id + ", duration=" + duration + ", distance=" + distance + "]";
	}
	
	
}
