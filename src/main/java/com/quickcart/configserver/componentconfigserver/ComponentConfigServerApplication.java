package com.quickcart.configserver.componentconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ComponentConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComponentConfigServerApplication.class, args);
	}

}
