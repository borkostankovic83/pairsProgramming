package com.gasolution.distanceunit.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Bad request parameters.")
public class BadRequestException extends RuntimeException {
}
