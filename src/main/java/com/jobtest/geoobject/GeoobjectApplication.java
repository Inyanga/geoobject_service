package com.jobtest.geoobject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GeoobjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeoobjectApplication.class, args);
	}

}
