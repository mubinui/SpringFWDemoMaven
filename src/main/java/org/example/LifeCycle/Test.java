package org.example.LifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("SamosaConfig.xml");
//        Samosa samosa =(Samosa) context.getBean("s1");
//        System.out.println(samosa);
        context.registerShutdownHook();
//        //registerShutdownHook for calling destroy method
//        System.out.println("....................................................");
//        AbstractApplicationContext context1 = new ClassPathXmlApplicationContext("SamosaConfig.xml");
//        Pepsi pepsi = (Pepsi) context1.getBean("p1");
//        System.out.println(pepsi);
//        context1.registerShutdownHook();
        Piaju piaju = (Piaju) context.getBean("pi1");
        System.out.println(piaju);
    }
}
