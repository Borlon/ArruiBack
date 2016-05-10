package com.umu.arrui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@Configuration
//@ComponentScan(basePackages={"com.umu.*"})
//@EnableAutoConfiguration
//@EnableJpaRepositories
@SpringBootApplication
public class Application {

	public static void main(String[] args) {	
		SpringApplication.run(Application.class, args);
	}
}
