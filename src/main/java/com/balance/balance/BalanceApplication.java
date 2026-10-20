package com.balance.balance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController 
public class BalanceApplication {
	@GetMapping("/")
    public String home() {
        return "Welcome to Balance!";
	}
	public static void main(String[] args) {
		SpringApplication.run(BalanceApplication.class, args);
	}


}
