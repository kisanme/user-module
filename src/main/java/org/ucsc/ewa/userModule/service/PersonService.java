package org.ucsc.ewa.userModule.service;


import org.ucsc.ewa.userModule.model.Person;

public interface PersonService {

    Person findPersonById(Long id);

    Person findPersonByMobileNumber(String mobileNumber);

    void savePerson(Person person);

    void updatePerson(Person person);
}
