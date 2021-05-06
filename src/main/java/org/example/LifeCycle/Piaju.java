package org.example.LifeCycle;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Piaju {
    private String subject;

    public Piaju() {
       super();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    @PostConstruct //init JAVA EE ANNOTATIONS
    public void start(){
        System.out.println("->Starting");
    }
    @PreDestroy // destroy
    public void end(){
        System.out.println("->Ending");
    }

    @Override
    public String toString() {
        return "Piaju{" +
                "subject='" + subject + '\'' +
                '}';
    }
}
