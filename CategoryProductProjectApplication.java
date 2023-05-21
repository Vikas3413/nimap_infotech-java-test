package com.Category.ProductProject;

import javax.persistence.Entity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class CategoryProductProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CategoryProductProjectApplication.class, args);
	}

}
