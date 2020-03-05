package com.gasolution.distanceunit.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@IdClass(ConversionUnit.class)
public class DistanceUnitConversion {
    @Id
    @Enumerated(EnumType.STRING)
    @Column(length = 12)
    private DistanceUnit fromUnit;

    @Id
    @Enumerated(EnumType.STRING)
    @Column(length = 12)
    private DistanceUnit toUnit;

    private Double unit;

    public DistanceUnit getFromUnit() {
        return fromUnit;
    }

    public void setFromUnit(DistanceUnit fromUnit) {
        this.fromUnit = fromUnit;
    }

    public DistanceUnit getToUnit() {
        return toUnit;
    }

    public void setToUnit(DistanceUnit toUnit) {
        this.toUnit = toUnit;
    }

    public Double getUnit() {
        return unit;
    }

    public void setUnit(Double unit) {
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DistanceUnitConversion)) return false;
        DistanceUnitConversion that = (DistanceUnitConversion) o;
        return getFromUnit() == that.getFromUnit() &&
                getToUnit() == that.getToUnit() &&
                getUnit().equals(that.getUnit());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFromUnit(), getToUnit(), getUnit());
    }
}
