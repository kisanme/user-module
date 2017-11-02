package org.ucsc.ewa.userModule.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.ucsc.ewa.userModule.model.Person;


@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
