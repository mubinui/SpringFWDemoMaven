package org.example.Stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("StereoConfig.xml");
        Student student = context.getBean("ob",Student.class);
        System.out.println(student);
        System.out.println(student.hashCode());
        Student student1 = context.getBean("ob",Student.class);
        System.out.println(student1.hashCode());
        Teacher teacher1 = context.getBean("teacher",Teacher.class);
        System.out.println(teacher1.hashCode());
        Teacher teacher2 = context.getBean("teacher",Teacher.class);
        System.out.println(teacher2.hashCode());
    }
}
