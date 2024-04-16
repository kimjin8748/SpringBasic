package inhatc.cse.spring.di.java_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class AppConfig {

    @Bean
    public Student student1(){

        ArrayList<String> hobbys = new ArrayList<>();
        hobbys.add("골프");
        hobbys.add("야구");
        hobbys.add("농구");

//        hobbys.stream().sorted().forEach(s -> System.out.println(s));

        Student student = new Student("김용진", 25, hobbys);
        student.setHeight(165.8);
        student.setWeight(80.5);

        return student;
    }

    @Bean
    public Student student2(){
        ArrayList<String> hobbys = new ArrayList<>();
        hobbys.add("독서");
        hobbys.add("당구");

        Student s = new Student("김아빠", 50, hobbys);
        s.setHeight(170);
        s.setWeight(75);

        return s;
    }
}
