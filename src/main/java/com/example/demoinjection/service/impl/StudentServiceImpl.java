package com.example.demoinjection.service.impl;

import com.example.demoinjection.entity.Student;
import com.example.demoinjection.payload.StudentDTO;
import com.example.demoinjection.repository.StudentRepository;
import com.example.demoinjection.service.StudentService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;
    private ModelMapper modelMapper;

    public StudentServiceImpl(StudentRepository studentRepository, ModelMapper modelMapper) {
        this.studentRepository = studentRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public StudentDTO createStudent(StudentDTO studentDTO){
        Student student = modelMapper.map(studentDTO, Student.class);
        studentRepository.save(student);

        return studentDTO;
    }
}
