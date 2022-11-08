package org.kontza.liquified;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("test")
class LiquifiedApplicationTests {
	private static final Logger logger = LoggerFactory.getLogger(LiquifiedApplicationTests.class);
	@Autowired
	private StuffRestController stuffRestController;

	@Test
	void contextLoads() {
	}

	@Test
	void stuffIsFound() {
		ResponseEntity<List<Stuff>> stuffResponse = stuffRestController.getStuff();
		List<Stuff> stuff = stuffResponse.getBody();
		logger.error(">>> stuff = {}", stuff);
		assertEquals(stuff.size(),2);
	}
}
