package com.example.demo_spring_Boot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class DemoSpringBootApplicationTests {

	@Test
	void contextLoads() {
	}

}
