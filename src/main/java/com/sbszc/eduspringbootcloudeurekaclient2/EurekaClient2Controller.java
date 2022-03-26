package com.sbszc.eduspringbootcloudeurekaclient2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EurekaClient2Controller {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping
	public String makeRequest() {
		return restTemplate.getForObject("http://eureka-client-1/ping", String.class);
	}
}
