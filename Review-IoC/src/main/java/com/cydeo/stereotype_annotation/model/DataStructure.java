package com.cydeo.stereotype_annotation.model;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataStructure {

    @Autowired
    ExtraHours extraHours;

    /*
    Can also just create a constructor without using the annotation
    can also add a lambok annotation AllArgConstructor
     */

    public void getTotalHours(){
        System.out.println("Total hours: " + (10 + extraHours.getHours()));
    }

}
