package org.example.CollectionSA;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("CollectionConfig.xml");
        Person person = (Person) context.getBean("p1");
        System.out.println(person);
        Person person1 = (Person) context.getBean("p2");
        System.out.println(person1);
        System.out.println(person.getFriends().getClass().getName());
        System.out.println(person.getFeeStructure().getClass().getName());

    }
}
