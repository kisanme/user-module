package org.ucsc.ewa.userModule.service;

import org.ucsc.ewa.userModule.model.Person;

public interface PersonService {

    Person findOneById(Long id);
}
