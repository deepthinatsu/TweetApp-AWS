package com.tweetapp;
import org.springframework.web.filter.CorsFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class TweetAppApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TweetAppApiApplication.class, args);
	}
	
	@Bean
	public Docket productApi() {
	   return new Docket(DocumentationType.SWAGGER_2).select()
	      .apis(RequestHandlerSelectors.basePackage("com.tweetapp")).build();
	}

}
