package org.giveucredit.springcloud.euraka.mjf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurakaMain {

	private static Logger logger = LoggerFactory.getLogger(SpringCloudEurakaMain.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurakaMain.class, args);
		logger.info("SpringCloudEurakaMain start success");
	}
	
}
