package com.autowiringExample.annotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
    @Autowired
    @Qualifier("address2")
    private Address address;

    public void setAddress(Address address) {
        this.address = address;
    }


    public Address getAddress() {

        return address;
    }


    public Employee(Address address) {
        super();
        this.address = address;
        System.out.println("Employee constructor called");
    }

    public Employee() {
        super();
    }

    // toString method
    public String toString() {
        return "Employee [address=" + address + "]";
    }


}
