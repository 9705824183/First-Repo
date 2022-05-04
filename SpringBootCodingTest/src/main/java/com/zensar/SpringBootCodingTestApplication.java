package com.zensar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.zensar"})
public class SpringBootCodingTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCodingTestApplication.class, args);
	}

}
