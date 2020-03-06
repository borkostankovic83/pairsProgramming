package com.revature.cognizant.aggregatedService;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.cognizant.aggregatedService.conroller.AggregatedController;
import com.revature.cognizant.model.SpeedResult;

@SpringBootTest
class AggregatedServiceApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void postRequestBody() {
		AggregatedController ac = new AggregatedController();
		SpeedResult sr = new SpeedResult(0, "Drop tennis ball", );
		sr.
		ObjectMapper om = new ObjectMapper();
		String test = om.writeValueAsString(value);
		String result = ac.postExperiment(test);
	}
}
