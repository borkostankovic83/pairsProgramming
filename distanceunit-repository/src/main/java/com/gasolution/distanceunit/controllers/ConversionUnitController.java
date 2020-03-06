package com.gasolution.distanceunit.controllers;

import com.gasolution.distanceunit.exceptions.BadRequestException;
import com.gasolution.distanceunit.exceptions.ConversionNotFoundException;
import com.gasolution.distanceunit.models.ConversionUnit;
import com.gasolution.distanceunit.models.DistanceUnit;
import com.gasolution.distanceunit.models.DistanceUnitConversion;
import com.gasolution.distanceunit.repository.ConversionUnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/convert")
public class ConversionUnitController {

    @Autowired
    private ConversionUnitRepository repository;
    @GetMapping("/{from}/to/{to}")
    public Double convert(@RequestParam Double unit, @PathVariable String from, @PathVariable String to) {
        try {
            DistanceUnit fromUnit = DistanceUnit.getDistanceUnit(from);
            DistanceUnit toUnit = DistanceUnit.getDistanceUnit(to);
            Optional<DistanceUnitConversion> result = repository.findById(new ConversionUnit(fromUnit, toUnit));

            if (result.isPresent()) {
                return unit / result.get().getUnit();
            }
        } catch (IllegalArgumentException e) {
            throw new BadRequestException();
        }

        throw new ConversionNotFoundException();
    }
}
