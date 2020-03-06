package com.revature.cognizant.database.data;

import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
public class Distance {
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
