package inhatc.cse.spring.di.lifecycle;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:lifecycle/appCTX.xml");
        ctx.refresh();

        Student student1 = ctx.getBean("myinfo", Student.class);
        System.out.println(student1);

        Student2 student2 = ctx.getBean("your_info", Student2.class);
        System.out.println(student2);

        ctx.close();
    }
}
