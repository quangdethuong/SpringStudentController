package com.Student.Student.Config;

import com.Student.Student.Model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomConfig {

    @Bean
    public StudentModel studentModel(){
        StudentModel studentModel = new StudentModel();
        return studentModel;
    }
}
