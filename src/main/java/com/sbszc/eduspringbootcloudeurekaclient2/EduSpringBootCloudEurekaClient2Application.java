package com.sbszc.eduspringbootcloudeurekaclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EduSpringBootCloudEurekaClient2Application {

    public static void main(String[] args) {
        SpringApplication.run(EduSpringBootCloudEurekaClient2Application.class, args);
    }

}
