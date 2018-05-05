package com.kish.learn.spock.demo.jpa.service

import com.kish.learn.spock.demo.model.Person
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
//import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

//import org.springframework.test.context.TestPropertySource
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE,classes = [{ PersonService.class},{ PersonRepository.class }] )

//@AutoConfigureMockMvc
//@TestPropertySource(locations = "classpath:application-integrationtest.properties")
class PersonServiceTest extends Specification {

    @Autowired
    PersonService personService

    void setup() {
        def person = new Person(firstName: "Thej",lastName: "Karuneegar",age: 33,sex: 'M',email: "kishores1984@gmail.com")
        def person1 = new Person(firstName: "Shanaya",lastName: "Karuneegar",age: 1,sex: 'F',email: "shanaya1011@gmail.com")
        def person2 = new Person(firstName: "Abirami",lastName: "Karuneegar",age: 26,sex: 'F',email: "abirami0404@gmail.com")

        personService.personRepository.save(person)
        personService.personRepository.save(person1)
        personService.personRepository.save(person2)
    }

    def "GetAllPerson"() {

        when:
           def personList = personService.getAllPerson()

        then:
            personList.size() == 3

    }
}
