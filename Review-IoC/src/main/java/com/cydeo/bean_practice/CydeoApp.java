package com.cydeo.bean_practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class,ConfigApp2.class);

        FullTimeEmployee ft = container.getBean(FullTimeEmployee.class);
        ft.createAccrount();

        PartTimeEmployee pt = container.getBean(PartTimeEmployee.class);
        pt.createAccrount();

        String str1 = container.getBean("name", String.class);
        System.out.println("str1 = " + str1);

        String str2 = container.getBean("str2",String.class);
        System.out.println("str2 = " + str2);
    }

}
