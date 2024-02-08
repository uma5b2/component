package com.appdev.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.appdev"})
public class ComponentApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComponentApplication.class, args);
	}

}
