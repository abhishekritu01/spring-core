package com.constructiorinjuction;

import java.util.List;

public class Person {

    private String name;
    private int personId;

    private Certificate certificate;
    private List<String> phones;

    public Person(String name, int personId, Certificate certificate, List<String> phones) {
        this.name = name;
        this.personId = personId;
        this.certificate = certificate;
        this.phones = phones;

    }

    public void display() {
        System.out.println("Name: "+name);
        System.out.println("Person Id: "+personId);
        System.out.println("Certificate: "+certificate);
        System.out.println("Phones: "+phones);
    }

//    to string method
    @Override
    public String toString() {
        return this.name+" : "+this.personId+" : "+this.certificate+" : "+this.phones;
    }



}
