package com.revature.cognizant.aggregate.services;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="database")
public interface AggregateService {

}
