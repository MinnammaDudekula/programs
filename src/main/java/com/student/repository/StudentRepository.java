package com.student.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.student.entity.Student;

public interface StudentRepository extends MongoRepository<Student, String>{

}
