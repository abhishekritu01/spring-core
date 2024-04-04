package com.constructiorinjuction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/constructiorinjuction/config.xml");
        Person person = (Person) context.getBean("person");


        Addition add=(Addition)  context.getBean("person1");

        add.doSum();

        person.display();


    }
}
