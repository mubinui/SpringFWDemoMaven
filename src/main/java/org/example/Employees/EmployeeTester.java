package org.example.Employees;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTester {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("EmployeeConfig.xml");
        Employee employee =(Employee) context.getBean("employee01");
        System.out.println(employee.getAddress());
        System.out.println(employee.getCourses());
        System.out.println(employee.getPhones());
        System.out.println(employee);
        System.out.println(employee.getPhones().getClass().getName());
    }
}
