package com.pluralsight.personapp.controller;

import com.pluralsight.personapp.models.Person;
import com.pluralsight.personapp.serviceclass.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
class PersonController {
    private final PersonService personService;
    @Autowired

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public ResponseEntity<List<Person>> showAllPersons(){
        return ResponseEntity.ok(personService.showAllPersons());
    }

    @GetMapping("/{id}")
    public Person showPersonById(@PathVariable Long id){
        return personService.showPersonById(id);
    }


}
