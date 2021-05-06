package org.example.Autowiring;
//by name
//by type
//by constructor

public class Emp {
    private Address address;

    public Emp() {
    }

    public Emp(Address address) {
        System.out.println("->Running baby");
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

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
