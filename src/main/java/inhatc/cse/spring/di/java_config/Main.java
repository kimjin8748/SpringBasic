package inhatc.cse.spring.di.java_config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Student s1 = ctx.getBean("student1", Student.class);

        System.out.println(s1.getName());
        System.out.println(s1.getHobbys());
        s1.getHobbys().stream().sorted().forEach(System.out::println);

        Student s2 = ctx.getBean("student2", Student.class);

        System.out.println(s2.getName());
        System.out.println(s2.getHobbys());

    }
}
