package com.example.demoinjection.service;

import com.example.demoinjection.entity.Student;
import com.example.demoinjection.payload.StudentDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface StudentMapper {
    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "exp", target = "exp")
    Student studentDTOToStudent(StudentDTO studentDTO);
}
