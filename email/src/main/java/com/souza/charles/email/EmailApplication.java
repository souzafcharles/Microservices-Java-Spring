package com.souza.charles.email;

import com.souza.charles.email.environment.LoadEnvironment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmailApplication {

	public static void main(String[] args) {
		LoadEnvironment.loadEnv();
		SpringApplication.run(EmailApplication.class, args);
	}

}
