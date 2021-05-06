package org.example.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("EmpConfig.xml");
//        Emp emp1 = (Emp) context.getBean("e1");
//        System.out.println(emp1);
        Emp emp2 = context.getBean("emp",Emp.class);
        System.out.println(emp2);

    }
}
