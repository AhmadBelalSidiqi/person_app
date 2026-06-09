package com.pluralsight.personapp.Repositories;

import com.pluralsight.personapp.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
