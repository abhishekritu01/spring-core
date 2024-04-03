package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
      ApplicationContext context =new FileSystemXmlApplicationContext(("src/main/java/com/springcore/ref/config.xml"));
        A a = (A) context.getBean("Aref");
        System.out.println(a);
        System.out.println(a.getX());
        System.out.println(a.getOb().getY());
    }
}
