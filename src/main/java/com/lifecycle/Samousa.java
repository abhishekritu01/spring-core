package com.lifecycle;

public class Samousa {

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting price");
        this.price = price;
    }

    public Samousa() {
        super();
    }


    public String toString() {
        return "Samousa [price=" + price + "]";
    }


    public void init() {
        System.out.println("Init method called for Samousa");
    }


    public void destroy() {
        System.out.println("Destroy method called for Samousa");
    }

}
