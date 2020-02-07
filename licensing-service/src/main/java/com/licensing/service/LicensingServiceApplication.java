package com.licensing.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
@EnableDiscoveryClient //to use discovery client
//@EnableFeignClients to use feign client
public class LicensingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LicensingServiceApplication.class, args);
    }

//	@LoadBalanced to use ribbon rest template
//	@Bean
//	public RestTemplate getRestTemplate() {
//		return new RestTemplate();
//	}

}
