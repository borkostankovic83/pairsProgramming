package com.gasolution.distanceunit.repository;

import com.gasolution.distanceunit.models.ConversionUnit;
import com.gasolution.distanceunit.models.DistanceUnitConversion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConversionUnitRepository extends JpaRepository<DistanceUnitConversion, ConversionUnit> {
}
