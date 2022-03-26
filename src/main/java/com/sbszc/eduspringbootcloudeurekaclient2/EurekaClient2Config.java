package com.sbszc.eduspringbootcloudeurekaclient2;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class EurekaClient2Config {

	@Bean
	@LoadBalanced
	public RestTemplate rt() {
		return new RestTemplate();
	}
}
