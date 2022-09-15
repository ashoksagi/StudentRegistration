package com.student.registration;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.student.registration.model.Student;


@RepositoryRestResource(collectionResourceRel ="students",path ="students")
public interface StudentRepository extends JpaRepository<Student, Integer> {

}