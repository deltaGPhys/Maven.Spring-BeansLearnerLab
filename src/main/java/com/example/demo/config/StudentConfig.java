package com.example.demo.config;

import com.example.demo.entities.Student;
import com.example.demo.entities.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class StudentConfig {

    @Bean(name = "students")
    public Students currentStudents() {
        ArrayList<Student> stuList = new ArrayList<>();
        stuList.add(new Student(1,"Kai"));
        stuList.add(new Student(2,"Chris"));
        stuList.add(new Student(3,"David"));
        stuList.add(new Student(4,"Josh"));
        stuList.add(new Student(5,"Charlotte"));

        return new Students(stuList);


    }
    @Bean(name = "previous students")
    public Students previousStudents() {
        ArrayList<Student> stuList = new ArrayList<>();
        stuList.add(new Student(1,"Julio"));
        stuList.add(new Student(2,"Christina"));
        stuList.add(new Student(3,"Davis"));
        stuList.add(new Student(4,"Jeff"));
        stuList.add(new Student(5,"Carrie"));

        return new Students(stuList);
    }
}
