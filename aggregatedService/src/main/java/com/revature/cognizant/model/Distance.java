package com.revature.cognizant.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Distance {
	@Id
	private Integer id;
	@ManyToOne
	private DistanceUnit distanceUnit;
	private Double unit;
	public Distance() {
		super();
	}
	public DistanceUnit getDistanceUnit() {
		return distanceUnit;
	}
	public void setDistanceUnit(DistanceUnit distanceUnit) {
		this.distanceUnit = distanceUnit;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
