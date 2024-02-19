package ru.mikhailov.seminar9task1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Seminar9task1Application {

	public static void main(String[] args) {
		SpringApplication.run(Seminar9task1Application.class, args);
	}

	@Bean
	public RouteLocator customRoutLocator (RouteLocatorBuilder builder){
		return  builder.routes()
				.route("Microservice1",r->r.path("/serviceA/**")
						.uri("http://localhost:8081/"))
				.route("Microservice2",r->r.path("/serviceB/**")
						.uri("http://localhost:8082/")).build();}
	}
