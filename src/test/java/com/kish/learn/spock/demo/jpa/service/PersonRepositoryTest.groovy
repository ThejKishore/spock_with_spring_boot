package com.kish.learn.spock.demo.jpa.service

import com.kish.learn.spock.demo.model.Person
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import spock.lang.Specification

@DataJpaTest
class PersonRepositoryTest extends Specification {


    @Autowired
    PersonRepository personRepository

    void setup() {
        def person = new Person(firstName: "Thej",lastName: "Karuneegar",age: 33,sex: 'M',email: "kishores1984@gmail.com")
        def person1 = new Person(firstName: "Shanaya",lastName: "Karuneegar",age: 1,sex: 'F',email: "shanaya1011@gmail.com")
        def person2 = new Person(firstName: "Abirami",lastName: "Karuneegar",age: 26,sex: 'F',email: "abirami0404@gmail.com")

        personRepository.save(person)
        personRepository.save(person1)
        personRepository.save(person2)


    }


    def "retrieve the  all person record"(){
        when:
            def personLis = personRepository.findAll()

        then:
            personLis.size() == 2

    }




}
