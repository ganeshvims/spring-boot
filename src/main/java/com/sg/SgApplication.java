package com.sg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
