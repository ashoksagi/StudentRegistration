package com.student.register;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel ="students",path ="students")
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
