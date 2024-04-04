package com.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


//----------------- 2 using InitializingBean and DisposableBean interface -----------------
public class Pepsi implements InitializingBean, DisposableBean {

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting price");
        this.price = price;
    }

    public Pepsi() {
        super();
    }

    public String toString() {
        return "Pepsi [price=" + price + "]";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // afterPropertiesSet() method is called after the properties are set
        System.out.println("Init method called for Pepsi");
        // all initialization logic goes here
    }


    @Override
    public void destroy() throws Exception {
        // destroy() method is called when the bean is destroyed
        System.out.println("Destroy method called for Pepsi");
        // all cleanup logic goes here
    }
}
