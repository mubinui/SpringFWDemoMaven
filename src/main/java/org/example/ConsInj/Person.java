package org.example.ConsInj;

public class Person {
    private String name ;
    private int pid;
    private Certif certi;

    public Person(String name, int pid , Certif certi) {
        this.name = name;
        this.pid = pid;
        this.certi= certi;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", pid=" + pid +
                ", certi=" + certi +
                '}';
    }
}
