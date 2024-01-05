package com.example.demoinjection.service.impl;

import com.example.demoinjection.entity.Student;
import com.example.demoinjection.payload.StudentDTO;
import com.example.demoinjection.repository.StudentRepository;
import com.example.demoinjection.service.StudentMapper;
import com.example.demoinjection.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    public StudentServiceImpl(StudentRepository studentRepository, StudentMapper studentMapper) {
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
    }

    public Student StudentDTOMapperStudent(StudentDTO studentDTO){
        return studentMapper.studentDTOToStudent(studentDTO);
    }

    @Override
    public StudentDTO createStudent(StudentDTO studentDTO){
        Student student = studentMapper.studentDTOToStudent(studentDTO);
        studentRepository.save(student);

        return studentDTO;
    }
}
