package com.example.demoinjection.config;

import com.example.demoinjection.service.StudentMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public StudentMapper studentMapper(){
        return Mappers.getMapper(StudentMapper.class);
    }
}
