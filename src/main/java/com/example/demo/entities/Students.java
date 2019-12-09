package com.example.demo.entities;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Students extends People<Student>{

    public Students(List<Student> personList) {
        super(personList);
    }

}
