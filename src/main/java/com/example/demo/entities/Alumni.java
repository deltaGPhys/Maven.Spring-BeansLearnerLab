package com.example.demo.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Alumni {

    @Autowired
    @Qualifier("instructors")
    private Instructors instructors;

    @Autowired
    @Qualifier("previous students")
    private Students students;


    @PostConstruct
    public void executeBootcamp() {
        for (Instructor instructor : instructors) {
            instructor.lecture(students, (1200.0 * students.size()) / instructors.size());
        }
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructors instructors) {
        this.instructors = instructors;
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }
}
