package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestServiceApplication {

	public static void main(String[] args) {
		if (args.length > 0 && "--version".equals(args[0])) {
            System.out.println("Version: 0.0.1-SNAPSHOT");
            return;
        }
		SpringApplication.run(RestServiceApplication.class, args);
	}

}
