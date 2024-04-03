package com.collection;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Employee {
              //-------------     implementation of collection
    private String name;
    private List <String> phones;
    private List <String> addresses;
    private Map<String,String> course;

    private Properties props;


    // getter and setter methods
    public void getNames() {
        System.out.println("Name: "+name);
    }
    public  void setName(String name) {
        this.name = name;
    }
    public void getPhones() {
        System.out.println("Phones: "+phones);
    }
    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public void getAddresses() {
        System.out.println("Addresses: "+addresses);
    }
    public void setAddresses(List<String> addresses) {
        this.addresses = addresses;
    }


    public void getCourse() {
        System.out.println("Course: "+course);
    }

    public void setCourse(Map<String, String> course) {
        this.course = course;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    // constructor
    public Employee(String name, List<String> phones, List<String> addresses, Map<String, String> course) {
        super();
        this.name = name;
        this.phones = phones;
        this.addresses = addresses;
        this.course = course;
        this.props = props;
    }

    public Employee() {
        super();
    }


    // to string method
    public String toString() {
        return "Employee [name=" + name + ", phones=" + phones + ", addresses=" + addresses + ", course=" + course + "]";
    }
}
