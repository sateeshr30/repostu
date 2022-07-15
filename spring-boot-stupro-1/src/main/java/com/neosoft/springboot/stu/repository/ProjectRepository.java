package com.neosoft.springboot.stu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neosoft.springboot.stu.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {

}
