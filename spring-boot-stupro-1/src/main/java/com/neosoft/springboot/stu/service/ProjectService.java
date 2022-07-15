package com.neosoft.springboot.stu.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.springboot.stu.model.Project;
import com.neosoft.springboot.stu.repository.ProjectRepository;
import com.neosoft.springboot.stu.repository.StudentRepository;

import org.springframework.stereotype.Service;

@Service
public class ProjectService {
	@Autowired
	private ProjectRepository projectRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	public Optional<Project> addProject(Long stuId,Project project) {
		return studentRepository.findById(stuId).map(student -> {
			project.setStudent(student);
			return projectRepository.save(project);
		});
	}
	
	public List<Project> getAllProject(){
		return projectRepository.findAll();
	}
}
