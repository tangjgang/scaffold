package com.sca.framework.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = {"com.sca.framework"})
@EnableDiscoveryClient
public class ScaGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScaGatewayApplication.class, args);
	}
}
