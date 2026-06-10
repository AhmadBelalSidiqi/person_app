package com.pluralsight.personapp;

import com.pluralsight.personapp.Repositories.PersonRepository;
import com.pluralsight.personapp.models.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PersonappApplication {

	public static void main(String[] args) {

		ApplicationContext beanBag = SpringApplication.run(PersonappApplication.class, args);
	}

}
