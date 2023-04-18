package com.dans.multipro.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.dans.multipro.test.config.AppProperties;

@EnableConfigurationProperties({ AppProperties.class })
@SpringBootApplication
@EnableFeignClients
public class DansMultiProTestApplication {

	public static void main(String[] args) {
		SpringApplication.run( DansMultiProTestApplication.class, args);
	}

}
