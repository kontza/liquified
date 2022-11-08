package org.kontza.liquified;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "org.kontza")
@SpringBootApplication(scanBasePackages = {"org.kontza"})
public class LiquifiedApplication {

	public static void main(String[] args) {
		SpringApplication.run(LiquifiedApplication.class, args);
	}

}
