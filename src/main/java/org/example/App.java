package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("StudentConfiguration.xml");
        Student s =(Student)context.getBean("student");
        System.out.println("->Setter Injection ");
        System.out.println(s);
        Student s1 = (Student) context.getBean("student2");
        System.out.println("->Constructor Injection ");
        System.out.println(s1);
        System.out.println(s1.getDept_list().get(0));

    }
}
