package com.example.demo.entities;

import com.example.demo.interfaces.Learner;

public class Student extends Person implements Learner {

    private double totalStudyTime;

    public Student(long id, String name) {
        super(id, name);
    }

    public void learn (double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
