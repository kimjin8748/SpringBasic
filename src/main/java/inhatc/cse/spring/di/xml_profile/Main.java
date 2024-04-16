package inhatc.cse.spring.di.xml_profile;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String config = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("dev or run :");
        String str = scanner.next();

        if(str.equals("dev")){
            config = "dev";
        } else if(str.equals("run")){
            config = "run";
        }
        scanner.close();

        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.getEnvironment().addActiveProfile(config);
        ctx.load("java_property/profile_dev.xml", "java_property/profile_run.xml");
        ctx.refresh();

        ServerInfo serverInfo = ctx.getBean("serverInfo", ServerInfo.class);
        System.out.println("ip : " + serverInfo.getIpNum());
        System.out.println("port : " + serverInfo.getPort());
    }
}
