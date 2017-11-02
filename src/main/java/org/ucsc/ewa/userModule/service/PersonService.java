package org.ucsc.ewa.userModule.service;


import org.ucsc.ewa.userModule.model.Person;

public interface PersonService {

    Person findPersonById(Long id);

    void savePerson(Person person);

    void updatePerson(Person person);
}
