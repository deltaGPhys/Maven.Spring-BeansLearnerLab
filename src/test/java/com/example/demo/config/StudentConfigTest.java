package com.example.demo.config;

import com.example.demo.entities.People;
import com.example.demo.entities.Student;
import com.example.demo.entities.Students;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class StudentConfigTest {

    @Autowired
    @Qualifier("students")
    private Students students;

    @Autowired
    @Qualifier("previous students")
    private Students previousStudents;


    @Test
    void currentStudents() {
        Assert.assertTrue(students.findById(2).getName().equals("Chris"));
    }

    @Test
    void previousStudents() {
        Assert.assertTrue(previousStudents.findById(2).getName().equals("Christina"));
    }
}