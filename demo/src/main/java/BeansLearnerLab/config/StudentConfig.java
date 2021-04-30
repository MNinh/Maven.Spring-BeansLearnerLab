package BeansLearnerLab.config;

import BeansLearnerLab.models.Student;
import BeansLearnerLab.models.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentConfig {


    @Bean(name = "students")
    public Students currentStudents(){
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(22L, "Mike"));
        studentList.add(new Student(24L, "Xiong"));
        studentList.add(new Student(25L, "Chris"));
        studentList.add(new Student(26L, "Abe"));
        studentList.add(new Student(27L, "Ashley"));
        studentList.add(new Student(28L, "Ryan"));
        studentList.add(new Student(29L, "Theresa"));
        studentList.add(new Student(30L, "Kelly"));
        studentList.add(new Student(31L, "Greg"));
        studentList.add(new Student(32L, "Jorge"));
        studentList.add(new Student(33L, "Hazel"));
        studentList.add(new Student(34L, "Justin"));
        studentList.add(new Student(35L, "Monali"));
        studentList.add(new Student(36L, "Lena"));

        return new Students(studentList);
    }

    @Bean(name = "prevStudents")
    public Students previousStudents(){
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(10L, "Voung"));
        studentList.add(new Student(11L, "Han"));
        studentList.add(new Student(12L, "Jeremy"));
        studentList.add(new Student(13L, "Josh"));
        studentList.add(new Student(14L, "Jack"));

        return new Students(studentList);

    }

}
