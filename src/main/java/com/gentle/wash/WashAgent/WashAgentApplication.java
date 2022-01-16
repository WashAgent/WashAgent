package com.gentle.wash.WashAgent;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.gentle.wash.WashAgent.mvc.dao")
public class WashAgentApplication {

	public static void main(String[] args) {
		SpringApplication.run(WashAgentApplication.class, args);
	}

}
