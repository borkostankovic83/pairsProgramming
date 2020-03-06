package com.revature.cognizant.database.data;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Distance {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="distance")
	@SequenceGenerator(name="distance", sequenceName="distance_seq", allocationSize=1)
	private Long id;
	@ManyToOne
	private DistanceUnit distanceUnit;
	private Double unit;
	public Distance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Distance(Long id, DistanceUnit distanceUnit, Double unit) {
		super();
		this.id = id;
		this.distanceUnit = distanceUnit;
		this.unit = unit;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
		return Objects.hash(distanceUnit, id, unit);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Distance))
			return false;
		Distance other = (Distance) obj;
		return distanceUnit == other.distanceUnit && Objects.equals(id, other.id) && Objects.equals(unit, other.unit);
	}
	@Override
	public String toString() {
		return "Distance [id=" + id + ", distanceUnit=" + distanceUnit + ", unit=" + unit + "]";
	}

	
	
}
