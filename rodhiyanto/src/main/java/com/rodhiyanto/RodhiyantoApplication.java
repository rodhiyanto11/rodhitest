package com.rodhiyanto;

import java.time.Duration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@SpringBootApplication
public class RodhiyantoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RodhiyantoApplication.class, args);
	}
	@Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder
        .setConnectTimeout(Duration.ofMillis(30000))
        .setReadTimeout(Duration.ofMillis(30000))
        .build();
    }

	
	
}
