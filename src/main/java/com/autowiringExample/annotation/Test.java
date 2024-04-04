package com.autowiringExample.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/autowiringExample/annotation/config.xml");
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);
    }
}
