package com.gasolution.distanceunit.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Conversion unit not found")
public class ConversionNotFoundException extends RuntimeException {
}
