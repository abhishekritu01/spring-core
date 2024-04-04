package com.autowiringExample;

public class Employee {

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
