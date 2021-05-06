package org.example.LifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean , DisposableBean {
    //init destroy using interface
    private double price;
    public Pepsi(){

    }

    public Pepsi(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pepsi{" +
                "price=" + price +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
//        init method
        System.out.println("taking pepsi: init");
    }

    @Override
    public void destroy() throws Exception {
//        destroy method
        System.out.println("Pepsi finished: destroy ");
    }
}
