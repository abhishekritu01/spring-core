package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/springcore/collection/config.xml");

        Employee Emp1 = (Employee) context.getBean("Emp1");

        Emp1.getNames();
        Emp1.getPhones();
        Emp1.getAddresses();
        Emp1.getCourse();


    }
}
