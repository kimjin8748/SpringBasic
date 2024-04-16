package inhatc.cse.spring.di.java_property;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        AdminConnect adminConfig = ctx.getBean("adminConfig", AdminConnect.class);
        System.out.println(adminConfig.getAdminId());
        System.out.println(adminConfig.getAdminPw());
        System.out.println(adminConfig.getSubId());
        System.out.println(adminConfig.getSubPw());
    }
}
