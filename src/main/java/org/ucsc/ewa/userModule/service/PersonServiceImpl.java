package org.ucsc.ewa.userModule.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ucsc.ewa.userModule.model.Person;
import org.ucsc.ewa.userModule.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public Person findPersonById(Long id) {


        Person one = personRepository.findOne(id);
        if (one == null) {
            throw new NullPointerException();
        }
        return one;
    }

    @Override
    public Person findPersonByMobileNumber(String mobileNumber) {
        Person one = personRepository.findOneByMobileNumber(mobileNumber);
        if (one == null) {
            throw new NullPointerException();
        }
        return one;
    }

    @Override
    public void savePerson(Person person) {
        personRepository.save(person);
    }

    @Override
    public void updatePerson(Person person) {
        Long personId = person.getId();
        if (personId == null) {
            throw new NullPointerException();
        }

        Person foundPerson = personRepository.findOne(personId);

        if (foundPerson == null) {
            throw new NullPointerException();
        }


        foundPerson.setEmail(person.getEmail());
        foundPerson.setFirstName(person.getFirstName());
        foundPerson.setLastName(person.getLastName());
        foundPerson.setMobileNumber(person.getMobileNumber());

        personRepository.save(foundPerson);

    }
}
