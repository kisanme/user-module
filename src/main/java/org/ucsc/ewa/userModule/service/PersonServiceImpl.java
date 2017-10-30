package org.ucsc.ewa.userModule.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.ucsc.ewa.userModule.model.Person;
import org.ucsc.ewa.userModule.repository.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public Person findOneById(Long id) {

        Person one = personRepository.findOne(id);
        return one;
    }
}
