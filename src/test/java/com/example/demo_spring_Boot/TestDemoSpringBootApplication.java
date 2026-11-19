package com.example.demo_spring_Boot;

import org.springframework.boot.SpringApplication;

public class TestDemoSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.from(DemoSpringBootApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
