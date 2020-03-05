package com.gasolution.distanceunit.models;

import java.io.Serializable;
import java.util.Objects;


public class ConversionUnit implements Serializable {
    private DistanceUnit fromUnit;
    private DistanceUnit toUnit;

    public ConversionUnit(DistanceUnit fromUnit, DistanceUnit toUnit) {
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
    }

    public ConversionUnit() {
    }

    public DistanceUnit getFromUnit() {
        return fromUnit;
    }

    public DistanceUnit getToUnit() {
        return toUnit;
    }

    public void setFromUnit(DistanceUnit fromUnit) {
        this.fromUnit = fromUnit;
    }

    public void setToUnit(DistanceUnit toUnit) {
        this.toUnit = toUnit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConversionUnit)) return false;
        ConversionUnit that = (ConversionUnit) o;
        return getFromUnit() == that.getFromUnit() &&
                getToUnit() == that.getToUnit();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFromUnit(), getToUnit());
    }
}
