package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("/src/main/java/config.xml");

        Student student = (Student) context.getBean("student");
        Student student1 = (Student) context.getBean("student1");

        System.out.println(student);
        System.out.println(student1);

        System.out.println("Hello world!");
    }
}
