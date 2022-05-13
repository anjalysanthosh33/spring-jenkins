package com.springjenkins;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SpringJenkinsApplicationTests {
	public static Logger log =org.slf4j.LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);

	@Test
	void contextLoads() {
		log.info("Test case executing");
		log.info("Test case executing 3");
		assertEquals(true,true);
	}

}
