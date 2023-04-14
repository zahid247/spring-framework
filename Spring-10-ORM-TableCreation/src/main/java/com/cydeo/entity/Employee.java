package com.cydeo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

//converting this class to table
@Entity
public class Employee {

    @Id
    private int id;
    private String name;


}
