package org.example.Student;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private Address address;
    private List<String> dept_list;

    public Student() {
    }

    public Student(List<String> dept_list) {
        this.dept_list = dept_list;
    }

    public Student(int id, String name, Address address , List<String> dept_list) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dept_list = dept_list;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<String> getDept_list() {
        return dept_list;
    }

    public void setDept_list(List<String> dept_list) {
        this.dept_list = dept_list;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", dept_list=" + dept_list +
                '}';
    }
}
