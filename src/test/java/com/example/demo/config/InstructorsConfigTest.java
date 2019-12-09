package com.example.demo.config;

import com.example.demo.entities.Instructor;
import com.example.demo.entities.Instructors;
import com.example.demo.entities.Students;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InstructorsConfigTest {

    @Autowired
    @Qualifier("usa instructors")
    private Instructors usInst;

    @Autowired
    @Qualifier("uk instructors")
    private Instructors ukInst;

    @Autowired
    @Qualifier("instructors")
    private Instructors inst;

    @Test
    public void tcUsaInstructors() {
        for (Instructor i : usInst) {
            System.out.println(i);
        }
        Assert.assertTrue(usInst.findById(2).getName().equals("Kelly"));
    }

    @Test
    public void tcUkInstructors() {
        Assert.assertTrue(ukInst.findById(2).getName().equals("Cheerio"));
    }

    @Test
    public void instructors() {
        Assert.assertTrue(inst.findById(2).getName().equals("Kris"));
    }
}