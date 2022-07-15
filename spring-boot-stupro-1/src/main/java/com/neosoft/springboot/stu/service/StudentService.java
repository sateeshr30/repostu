package com.neosoft.springboot.stu.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.springboot.stu.model.Student;
import com.neosoft.springboot.stu.repository.StudentRepository;


@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepo;
	
	public void addStudent(Student student) {
		studentRepo.save(student);
	}
	
	public List<Student> getAllStudents(){
		return studentRepo.findAll();
	}
	
	
	public Optional<Student> getStudentById(Long id){
		return studentRepo.findById(id);
	}

}
