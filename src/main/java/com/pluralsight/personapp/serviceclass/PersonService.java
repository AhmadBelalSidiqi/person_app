package com.pluralsight.personapp.serviceclass;

import com.pluralsight.personapp.Repositories.PersonRepository;
import com.pluralsight.personapp.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {

    private final PersonRepository personRepository;
    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getAllPersons(){
        return personRepository.findAll();
    }

    public Person getPersonById(Long id) {
        return personRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Person not found"));
    }
    public Person addPerson(Person person){
        return personRepository.save(person);
    }
    public String deletePerson (Long id){
        personRepository.deleteById(id);
        return "Person with id: "+ id + " deleted";
    }
    public Person updatePerson(Long id , Person updatedPerson){
        Person exiting = getPersonById(id);
        if (updatedPerson.getName()!= null )
            exiting.setName(updatedPerson.getName());
        if (updatedPerson.getEmail() != null)
            exiting.setEmail(updatedPerson.getEmail());
        return personRepository.save(exiting);
    }

    public List<Person> getAdults(){
        return getAllPersons().stream().filter(p -> p.getAge() > 18).collect(Collectors.toList());
    }
}
