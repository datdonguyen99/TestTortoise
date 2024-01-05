package com.example.demoinjection.service.impl;

import com.example.demoinjection.entity.Student;
import com.example.demoinjection.payload.StudentDTO;
import com.example.demoinjection.repository.StudentRepository;
import com.example.demoinjection.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public StudentDTO createStudent(StudentDTO studentDTO){
//        Student student = new Student();
//        student.setName(studentDTO.getName());
//        student.setExp(studentDTO.getExp());
//        studentRepository.save(student);
        studentRepository.save(new Student(studentDTO.getName(),studentDTO.getExp()));
        return studentDTO;
    }
}
