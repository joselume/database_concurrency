package com.github.joselume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.github.joselume")
@EnableJpaRepositories(basePackages = {"com.github.joselume"})
public class ConcurrencyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConcurrencyApplication.class, args);
	}

}