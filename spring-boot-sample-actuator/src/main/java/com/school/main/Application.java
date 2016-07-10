package com.school.main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
@EnableAutoConfiguration
@EnableWebMvc
@Component
@ComponentScan(basePackages = "com.school.main")
@EnableScheduling
@ImportResource("classpath:ApplicationContext.xml")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
