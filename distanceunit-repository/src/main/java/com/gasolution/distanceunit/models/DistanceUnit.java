package com.gasolution.distanceunit.models;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public enum DistanceUnit {
    Millimeters("millimeters"),
    Centimeters("centimeters"),
    Meters("meters"),
    Kilometers("kilometers"),
    Inches("inches"),
    Feet("feet"),
    Yards("yards"),
    Miles("miles");

    private String alterName;

    DistanceUnit(String alterName) {
        this.alterName = alterName;
    }

    private static final Map<String, DistanceUnit> distanceUnitMap = new HashMap<>();
    static {
        for(DistanceUnit unit: DistanceUnit.values()) {
            distanceUnitMap.put(unit.alterName, unit);
        }
    }

    public static DistanceUnit getDistanceUnit(String name) {
        Optional<DistanceUnit> unit = Optional.ofNullable( DistanceUnit.distanceUnitMap.get(name.toLowerCase()));
        if(unit.isPresent()) {
            return unit.get();
        }
        throw new IllegalArgumentException();
    }
}
