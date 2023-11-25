package com.student.controller;
 
 
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.*;

import com.student.entity.Student;
import com.student.service.StudentService;
	@RestController
	@RequestMapping("/students")
	public class StudentController {
	    @Autowired
	    private StudentService studentService;
	    @PostMapping
	    public ResponseEntity<Object> addStudent(@RequestBody Student student) {
	        
	        return ResponseEntity.ok(studentService.saveStudent(student));
	    }
	    @GetMapping("/{id}")
	    public ResponseEntity<Object> getStudentById(@PathVariable Long id) {
	       
	        return ResponseEntity.ok(studentService.getStudentById(id));
	    }
	    @PutMapping("update/{id}")
	    public ResponseEntity<Object> updateStudent(@PathVariable Long id, @RequestBody Student updatedStudent) {
	        
	        return ResponseEntity.ok(studentService.updateStudent(id, updatedStudent));
	    }
	    @DeleteMapping("delete/{id}")
	    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
	        
	        studentService.deleteStudent(id);
	        return ResponseEntity.noContent().build();
	    }
	}