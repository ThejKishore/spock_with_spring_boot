package com.kish.learn.spock.demo.jpa.service;


import com.kish.learn.spock.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }


    public List<Person> getAllPerson(){
        return this.personRepository.findAll();
    }

}
