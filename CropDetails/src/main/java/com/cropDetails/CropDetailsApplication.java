package com.cropDetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class CropDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CropDetailsApplication.class, args);
	}

}
