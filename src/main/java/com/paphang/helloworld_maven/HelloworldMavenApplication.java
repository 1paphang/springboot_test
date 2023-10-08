package com.paphang.helloworld_maven;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.paphang.helloworld_maven.mapper")
public class HelloworldMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldMavenApplication.class, args);
	}

}
