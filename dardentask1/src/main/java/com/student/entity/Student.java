package com.student.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Student {

	    @Id
	    
	    private String name;
	    private int age;
	    private double salary;
		
		
		public Student(String name, int age, double salary) {
			super();
			this.name = name;
			this.age = age;
			this.salary = salary;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public static Object builder(String string, int i, double d) {
			
			return null;
		}

	    

	}



