package com.student.service;


import org.springframework.stereotype.Service;

import com.student.entity.Student;
@Service

public class StudentService {

	public Object saveStudent(Student student) {
		
		return student;
	}

	public Object getStudentById(Long id) {
		
		return id;
	}

	public Object updateStudent(Student id, Student updatedStudent) {
		
		return updatedStudent;
	}

	public Object updateStudent(Long id, Student updatedStudent) {
		
		return updatedStudent;
	}

	public void deleteStudent(Long id) {
		
		return;
		
	}

}
