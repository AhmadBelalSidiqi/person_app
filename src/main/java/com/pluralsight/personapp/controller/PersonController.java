package com.pluralsight.personapp.controller;

import com.pluralsight.personapp.models.Person;
import com.pluralsight.personapp.serviceclass.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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
    public ResponseEntity<List<Person>> showAllPersons() {
        return ResponseEntity.ok(personService.getAllPersons());
    }

    @GetMapping("/{id}")
    public Person showPersonById(@PathVariable Long id) {
        return personService.getPersonById(id);
    }

    @PostMapping
    public Person addPerson(@RequestBody Person person) {
        return personService.addPerson(person);
    }

    @DeleteMapping("/{id}")
    public String deletePerson(@PathVariable Long id) {
        return personService.deletePerson(id);
    }

    @PutMapping("/{id}")
    public Person updatedPerson(@PathVariable Long id,@RequestBody Person updatedPerson){
        return personService.updatePerson(id,updatedPerson);
    }

    @GetMapping("/adults")
    public List<Person> getAdults(){
        return personService.getAdults();
    }


}