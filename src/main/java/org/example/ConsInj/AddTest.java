package org.example.ConsInj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AddTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AdditionConfig.xml");
        Addition addition = (Addition) context.getBean("a1");
        addition.doSum();
    }
}
