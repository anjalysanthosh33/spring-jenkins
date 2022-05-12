package com.springjenkins;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {
	public static Logger log =org.slf4j.LoggerFactory.getLogger(SpringJenkinsApplication.class);
	@PostConstruct
	public void init()
	{
		log.info("Application started");
	}
	public static void main(String[] args) {
		log.info("Application executed");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
