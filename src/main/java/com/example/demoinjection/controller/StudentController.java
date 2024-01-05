package com.example.demoinjection.controller;

import com.example.demoinjection.payload.StudentDTO;
import com.example.demoinjection.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // create student
    @PostMapping("/api/v1/students")
    public ResponseEntity<StudentDTO> createStudent(@RequestBody StudentDTO studentDTO){
        return new ResponseEntity<>(studentService.createStudent(studentDTO), HttpStatus.CREATED);
    }

    @GetMapping("api/v1/student")
    public String getHello(){
        return "HEllo!";
    }
}
