package org.example.Annotations;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
    @Autowired
    @Qualifier("address2") // Bean name qualifier
    private Address address;

    public Emp() {
    }
//    @Autowired Constructor
    public Emp(Address address) {
        System.out.println("->Running baby");
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
    //@Autowired
    public void setAddress(Address address) {
        System.out.println("->Running setter");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }
}
