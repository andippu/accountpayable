package com.ap.accountpayable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AccountpayableApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountpayableApplication.class, args);
	}

}
