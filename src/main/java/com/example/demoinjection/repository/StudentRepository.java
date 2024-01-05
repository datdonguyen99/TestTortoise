package com.example.demoinjection.repository;

import com.example.demoinjection.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
