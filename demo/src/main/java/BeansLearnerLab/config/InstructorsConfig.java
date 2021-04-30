package BeansLearnerLab.config;

import BeansLearnerLab.models.Instructor;
import BeansLearnerLab.models.Instructors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class InstructorsConfig{

    @Primary
    @Bean(name = "instructors")
    public Instructors instructors(){
        List<Instructor> instructorsList = new ArrayList<>();

        instructorsList.add(new Instructor(1L, "Kris"));
        instructorsList.add(new Instructor(2L, "Dolio"));
        instructorsList.add(new Instructor(3L, "Nobles"));


        return new Instructors(instructorsList);
    }

    @Bean(name = "tcUsaInstructors")
    public Instructors tcUsaInstructors(){
        List<Instructor> instructorsList = new ArrayList<>();

        instructorsList.add(new Instructor(4L, "Gina"));
        instructorsList.add(new Instructor(5L, "Paul"));
        return new Instructors(instructorsList);
    }

    @Bean(name = "tcUkInstructors")
    public Instructors tcUkInstructors(){
        List<Instructor> instructorsList = new ArrayList<>();

        instructorsList.add(new Instructor(6L, "Kate"));
        instructorsList.add(new Instructor(7L, "Arthur"));
        return new Instructors(instructorsList);
    }

}


