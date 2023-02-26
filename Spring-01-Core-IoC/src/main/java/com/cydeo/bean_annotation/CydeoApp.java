package com.cydeo.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {

    public static void main(String[] args) {

        ApplicationContext container =
                new AnnotationConfigApplicationContext(ConfigApp.class, ConfigAny.class);

        FullTimeMentor ft = container.getBean(FullTimeMentor.class);
        ft.createAccount();

//        PartTimeMentor pt = container.getBean("p2", PartTimeMentor.class);
        PartTimeMentor pt = container.getBean(PartTimeMentor.class);
        pt.createAccount();


        String str1 = container.getBean(ConfigAny.class).str();
        String str2 = container.getBean(String.class);
        System.out.println("str1 " + str1);
        System.out.println("str2 " + str2);

        System.out.println();

    }

}
