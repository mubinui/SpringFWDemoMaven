package org.example.Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("auto.xml");
        Emp emp1 = (Emp) context.getBean("e1");
        System.out.println(emp1);


    }
}
