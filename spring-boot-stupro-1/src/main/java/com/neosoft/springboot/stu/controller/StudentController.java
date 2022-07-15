package com.neosoft.springboot.stu.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.springboot.stu.model.Student;
import com.neosoft.springboot.stu.service.StudentService;


@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/addStudent")
	public void addStudentDetails(@RequestBody Student student) {
		studentService.addStudent(student);
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudentsDetails(){
		return studentService.getAllStudents();
	}
	
	@GetMapping("/student/id/{id}")
	public Optional<Student> getStudentDetailsById(@PathVariable Long id){
		return studentService.getStudentById(id);
	}

}
