package com.cydeo.stereotype_annotation;

import com.cydeo.stereotype_annotation.config.ConfigApp;
import com.cydeo.stereotype_annotation.model.DataStructure;
import com.cydeo.stereotype_annotation.model.Microservice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CydeoAppStereo {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class);

        DataStructure ds = container.getBean(DataStructure.class);
        ds.getTotalHours();
        Microservice ms = container.getBean(Microservice.class);
        ms.getTotalHours();



    }
}
