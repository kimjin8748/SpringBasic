package inhatc.cse.spring.di.pencil;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        String location = "classpath:pencil/appCTX.xml";
        AbstractApplicationContext ctx = new GenericXmlApplicationContext(location);
        Pencil pencil = ctx.getBean("pencil", Pencil.class);
        pencil.use();
    }
}
