package com.fluig;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

@Log4j2
@SpringBootApplication
@ComponentScan("com.fluig.controller")
@ComponentScan("com.fluig.service")
public class FluigApplication {

	public static void main(String[] args) {
		SpringApplication.run(FluigApplication.class, args);
	}

	@Bean
	ApplicationRunner applicationRunner(Environment environment) {
		return args -> {
			log.info("our database URL connection will be " + environment.getProperty("spring.datasource.url"));
		};
	}
}
