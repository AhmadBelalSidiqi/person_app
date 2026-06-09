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
		// Get your repo from the beanBag
		PersonRepository personRepo = beanBag.getBean(PersonRepository.class);

		// Feelin' crazy?  Test your code in Java.
		System.out.println(personRepo.save(new Person("Test1Repo","checking@repo.com")));

		personRepo.save(new Person("test2get","test2@gmail.com"));
	}

}
