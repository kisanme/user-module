package org.ucsc.ewa.userModule.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.ucsc.ewa.userModule.model.Person;
import org.ucsc.ewa.userModule.service.PersonService;
import org.ucsc.ewa.userModule.util.EwaResponse;


@RestController
@RequestMapping(value = "api/user/")
public class PersonController {

    @Autowired
    private PersonService personService;


    @PreAuthorize("#oauth2.hasScope('read')")
    @RequestMapping(value = "/{personId}", method = RequestMethod.GET)
    public EwaResponse<Person> getPerson(@PathVariable("personId") Long personId) {

        try {
            Person personById = personService.findPersonById(personId);
            System.out.println(personById.getFirstName());
            EwaResponse<Person> p = new EwaResponse<>();
            p.setData(personById);
            p.setStatusCode(200);
            return p;
        } catch (Exception ex) {
            EwaResponse<Person> p = new EwaResponse<>();
            p.setStatusCode(500);
            return p;
        }

    }

    @PreAuthorize("#oauth2.hasScope('read')")
    @RequestMapping(value = "/mobile/{mobile-number}", method = RequestMethod.GET)
    public EwaResponse<Person> getPersonFromMobile(@PathVariable("mobile-number") String mobileNumber) {

        try {
            Person personById = personService.findPersonByMobileNumber(mobileNumber);
            EwaResponse<Person> p = new EwaResponse<>();
            p.setData(personById);
            p.setStatusCode(200);
            return p;
        } catch (Exception ex) {
            EwaResponse<Person> p = new EwaResponse<>();
            p.setStatusCode(500);
            return p;
        }

    }

    @RequestMapping(method = RequestMethod.POST)
    public EwaResponse<Person> savePerson(@RequestBody Person person) {
        try {
            personService.savePerson(person);
            EwaResponse<Person> p = new EwaResponse<>();
            p.setStatusCode(200);
            return p;
        } catch (Exception ex) {
            EwaResponse<Person> p = new EwaResponse<>();
            p.setStatusCode(500);
            return p;
        }
    }

    @RequestMapping(method = RequestMethod.PUT)
    public EwaResponse<Person> updatePerson(@RequestBody Person person) {

        try {
            personService.updatePerson(person);
            EwaResponse<Person> p = new EwaResponse<>();
            p.setStatusCode(200);
            return p;
        } catch (Exception ex) {
            EwaResponse<Person> p = new EwaResponse<>();
            p.setStatusCode(500);
            return p;
        }
    }
}
