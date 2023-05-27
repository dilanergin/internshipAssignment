package probation.internshipAssignment.repository.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import probation.internshipAssignment.entities.concretes.Person;


public interface PersonRepository extends JpaRepository<Person, Integer> {
 
}
