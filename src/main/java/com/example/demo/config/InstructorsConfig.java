package com.example.demo.config;

import com.example.demo.entities.Instructor;
import com.example.demo.entities.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;

@Configuration
public class InstructorsConfig {

    @Bean(name = "usa instructors")
    public Instructors tcUsaInstructors() {
        ArrayList<Instructor> instList = new ArrayList<>();
        instList.add(new Instructor(1,"Doris"));
        instList.add(new Instructor(2,"Kelly"));
        instList.add(new Instructor(3,"Cap"));
        instList.add(new Instructor(4,"Robert"));
        instList.add(new Instructor(5,"Fred"));

        return new Instructors(instList);
    }

    @Bean(name = "uk instructors")
    public Instructors tcUkInstructors() {
        ArrayList<Instructor> instList = new ArrayList<>();
        instList.add(new Instructor(1,"Guvna"));
        instList.add(new Instructor(2,"Cheerio"));
        instList.add(new Instructor(3,"Pip Pip"));
        instList.add(new Instructor(4,"Boot"));
        instList.add(new Instructor(5,"Crisps"));

        return new Instructors(instList);
    }

    @Primary
    @Bean("instructors")
    public Instructors instructors() {
        ArrayList<Instructor> instList = new ArrayList<>();
        instList.add(new Instructor(1,"Dolio"));
        instList.add(new Instructor(2,"Kris"));
        instList.add(new Instructor(3,"Chris"));
        instList.add(new Instructor(4,"Roberto"));
        instList.add(new Instructor(5,"Froilan"));

        return new Instructors(instList);
    }
}
