package com.kish.learn.spock.demo.jpa.service;

import com.kish.learn.spock.demo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository  extends JpaRepository<Person,Long> {
}
