package com.example.demoH;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentResources {
	
	@Autowired
	StudentServices studentService;
	
	@GetMapping("/getall")
	private ResponseEntity<List<Student>> getAllStudents(){
		return new ResponseEntity<List<Student>>(studentService.getAllStudents(),HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	private ResponseEntity<Student> getStudentById(@PathVariable(name = "id")Integer id){
		return new ResponseEntity<Student>(studentService.getStudentById(id),HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<List<Student>> createStudent(@RequestBody Student students){
		return new ResponseEntity<List<Student>>(studentService.createStudent(students),HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<List<Student>> updateStudent (@RequestBody Student students){
		return new ResponseEntity<List<Student>>(studentService.updateStudent(students),HttpStatus.OK);
	}
	
	
	
	
	

}

