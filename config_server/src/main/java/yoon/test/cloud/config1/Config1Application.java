package yoon.test.cloud.config1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class Config1Application {

	public static void main(String[] args) {
		SpringApplication.run(Config1Application.class, args);
	}

}
