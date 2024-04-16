package inhatc.cse.spring.di.lifecycle;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Student2 {
    private int age;
    private String name;

    public Student2(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @PostConstruct
    public void initMethod() {
        System.out.println("Start 동작");
    }

    @PreDestroy
    public void destroyMethod() {
        System.out.println("End 동작");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
