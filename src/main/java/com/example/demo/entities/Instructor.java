package com.example.demo.entities;

import com.example.demo.interfaces.Learner;
import com.example.demo.interfaces.Teacher;
import org.springframework.stereotype.Component;

import java.util.Iterator;

public class Instructor extends Person implements Teacher {

    public Instructor(long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        int size = 0;
        Iterator it = learners.iterator();
        while (it.hasNext()) {
            size++;
            it.next();
        }
        for (Learner learner : learners) {
            learner.learn(numberOfHours / size);
        }
    }
}
