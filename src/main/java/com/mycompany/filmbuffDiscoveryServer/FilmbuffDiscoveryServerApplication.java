package com.mycompany.filmbuffDiscoveryServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class FilmbuffDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilmbuffDiscoveryServerApplication.class, args);
	}

}
