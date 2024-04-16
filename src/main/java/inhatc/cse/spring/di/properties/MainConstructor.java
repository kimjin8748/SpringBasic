package inhatc.cse.spring.di.properties;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainConstructor {
    public static void main(String[] args) {
        String location = "classpath:properties/constructorCTX.xml";
        AbstractApplicationContext ctx = new GenericXmlApplicationContext(location);
        MyInfo myInfo = ctx.getBean("myInfo2", MyInfo.class);

        System.out.println(myInfo);
        myInfo.getBmiCalc().bmiCalc(myInfo.getWeight(), myInfo.getHeight());

    }
}
