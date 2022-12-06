package com.amal.Share_Service.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.amal.Share_Service")
@EntityScan(basePackages = "com.amal.Share_Service.entity")
@EnableJpaRepositories(basePackages = "com.amal.Share_Service.persistence")
public class ShareServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(ShareServiceApplication.class, args);
	}

}
