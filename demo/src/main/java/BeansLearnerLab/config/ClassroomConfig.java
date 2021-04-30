package BeansLearnerLab.config;

import BeansLearnerLab.models.Classroom;
import BeansLearnerLab.models.Instructors;
import BeansLearnerLab.models.Students;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@EnableAutoConfiguration
public class ClassroomConfig {

    @Bean
    @DependsOn({"instructors", "students"})
    public Classroom currentCohort(Instructors instructors, Students students){
        return new Classroom(instructors, students);
    }

    @Bean
    public Classroom previousCohort(Instructors instructors, Students prevStudents){
        return new Classroom(instructors, prevStudents);
    }
}
