package inhatc.cse.spring.di.xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
//        MyCalculator myCalculator = new MyCalculator();
//        myCalculator.setCalculator(new Calculator());
//        myCalculator.setFirstNum(10);
//        myCalculator.setSecondNum(2);

        String configLocation = "classpath:appCTX.xml";
        AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
        MyCalculator myCalculator = ctx.getBean("myCalc", MyCalculator.class);

        myCalculator.add();
        myCalculator.sub();
        myCalculator.mul();
        myCalculator.div();
    }
}
