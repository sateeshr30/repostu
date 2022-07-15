package com.neosoft.springboot.stu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neosoft.springboot.stu.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
