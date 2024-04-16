package inhatc.cse.spring.di.multi_xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        String location = "classpath:multi_xml/appCTX.xml";
        String location2 = "classpath:multi_xml/appCTX2.xml";
        AbstractApplicationContext ctx = new GenericXmlApplicationContext(location, location2);
        StudentInfo studentInfo = ctx.getBean("studentInfo", StudentInfo.class);

        System.out.println(studentInfo.getStudent().getName());
        System.out.println(studentInfo.getStudent().getAge());

        Family family = ctx.getBean("family", Family.class);
        System.out.println(family.getPapaName());
        System.out.println(family.getSisterName());
    }
}
