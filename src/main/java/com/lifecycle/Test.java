package com.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {


    public static void main(String[] args) {

//        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/lifecycle/config.xml");
//
//        Samousa samousa = (Samousa) context.getBean("samousa-1");
//        System.out.println(samousa);


        AbstractApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/lifecycle/config.xml");
        Samousa samousa = (Samousa) context.getBean("samousa-1");
        System.out.println(samousa);
        // --------------------Registering shutdown hook-----------------
        context.registerShutdownHook();

//        System.out.println("-------------------------------------------------");




//        --------------- 2 using InitializingBean and DisposableBean interface -----------------

        Pepsi pepsi = (Pepsi) context.getBean("pepsi");
        System.out.println(pepsi);


        //================== 3 using  Annotation =================
        ExampleAnnotation example = (ExampleAnnotation) context.getBean("example");
        System.out.println(example + "====================");


    }
}
