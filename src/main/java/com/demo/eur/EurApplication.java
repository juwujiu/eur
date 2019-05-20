package com.demo.eur;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringCloudApplication
@EnableEurekaServer
public class EurApplication {

	public static void main(String[] args) {
//		new SpringApplicationBuilder(EurApplication.class).web(WebApplicationType.SERVLET).run(args);

//		new SpringApplicationBuilder(EurApplication.class).web(true).run(args);
		SpringApplication.run(EurApplication.class, args);
	}

}
