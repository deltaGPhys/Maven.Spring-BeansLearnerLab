package com.example.demo.config;

import com.example.demo.entities.Classroom;
import com.example.demo.entities.Instructors;
import com.example.demo.entities.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {



    @Bean(name = "cohort")
    @DependsOn({"instructors", "students"}) // this line strictly informational
    @Autowired
    public Classroom currentCohort(@Qualifier("instructors") Instructors i, @Qualifier("students") Students s) {
        return new Classroom(i,s);
    }

    @Bean(name = "previous cohort")
    @Autowired
    @DependsOn({"instructors", "previous students"}) // this line strictly informational
    public Classroom previousCohort(@Qualifier("instructors") Instructors i, @Qualifier("previous students") Students s) {
        return new Classroom(i,s);
    }


}
