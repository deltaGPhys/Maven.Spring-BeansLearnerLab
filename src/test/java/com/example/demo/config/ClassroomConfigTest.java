package com.example.demo.config;

import com.example.demo.entities.Classroom;
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
public class ClassroomConfigTest {

    @Autowired
    @Qualifier("cohort")
    Classroom currentCohort;

    @Autowired
    @Qualifier("previous cohort")
    Classroom pastCohort;

    @Test
    public void currentCohort() {
        Assert.assertTrue(currentCohort.getInstructors().findById(2).getName().equals("Kris"));
        Assert.assertTrue(currentCohort.getStudents().findById(2).getName().equals("Chris"));
    }

    @Test
    public void previousCohort() {
        Assert.assertTrue(pastCohort.getInstructors().findById(2).getName().equals("Kris"));
        Assert.assertTrue(pastCohort.getStudents().findById(2).getName().equals("Christina"));
    }
}