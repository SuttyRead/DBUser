package com.ua.sutty.dao;

import com.ua.sutty.model.Person;

import java.util.List;

public interface PersonDAO {

    void addPerson(Person person);

    void removePerson(long id);

    Person getPerson(long id);

    List<Person> getAllPersons();

    void updatePerson(Person person);

}
