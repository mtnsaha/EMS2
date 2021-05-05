package com.employee.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class EmployeeManagementSystemApplication {


	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);


	}

	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}

}
