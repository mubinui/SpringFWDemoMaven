package org.example.ConsInj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTester {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("PersonConfig.xml");
        Person person = (Person) context.getBean("p1");
        Person person1 = (Person) context.getBean("p2");
        System.out.println(person);
        System.out.println(person1);
    }
}
