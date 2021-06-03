package com.example.demoH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServices {
	
//	@Autowired
//	StudentRepository studentRepository;
	List<Student> student = new ArrayList<Student>(Arrays.asList(new Student(1,"Hrashikesh","Tiwari",91988079), new Student(2,"dsf","fhd",12345678), new Student(3,"abc","def",12343223))); 
	
	public List<Student> getAllStudents(){
		return student;
	}
	
	public Student getStudentById(Integer id) {
		Student stud = student.stream().filter(s -> s.getId().equals(id)).findFirst().get();
		return stud;
	}
	
	public List<Student> createStudent(Student students){
		student.add(students);
		return student;
	}
	
	public List<Student> updateStudent(Student students){
		student.stream().filter(s->s.getId().equals(students.getId())).findFirst().get()
		.setPhoneNumber(students.getPhoneNumber());
		return student;
	}
	

}
