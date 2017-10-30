package org.ucsc.ewa.userModule.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ucsc.ewa.userModule.model.Person;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
