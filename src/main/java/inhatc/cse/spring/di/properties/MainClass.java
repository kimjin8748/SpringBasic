package inhatc.cse.spring.di.properties;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        String location = "classpath:properties/appCTX.xml";
        AbstractApplicationContext ctx = new GenericXmlApplicationContext(location);
        MyInfo myInfo = ctx.getBean("myInfo", MyInfo.class);
        System.out.println(myInfo);

        myInfo.getBmiCalc().bmiCalc(82.2, 165);
    }
}
