package com.example.demo.entities;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlumniTest {

    @Autowired
    private Alumni alumni;

    @Test
    public void executeBootcampTest() {
        for (Student s: alumni.getStudents()) {
            Assert.assertEquals(1200.0, s.getTotalStudyTime(),.01);
        }
    }


}