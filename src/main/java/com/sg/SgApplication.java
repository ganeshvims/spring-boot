package com.sg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class SgApplication {
	
	@GetMapping("/hello")
    public String sayHello() {
        return "Hello Selva you did it... !";
    }

	public static void main(String[] args) {
		SpringApplication.run(SgApplication.class, args);
	}

}
