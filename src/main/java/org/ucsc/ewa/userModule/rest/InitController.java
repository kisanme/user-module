package org.ucsc.ewa.userModule.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.ucsc.ewa.userModule.model.Person;
import org.ucsc.ewa.userModule.service.PersonService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value = "api/")
public class InitController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/{personId}", method = RequestMethod.GET)
    public Person getPerson(@PathVariable("personId") Long personId) {

        return personService.findOneById(personId);
    }
}
