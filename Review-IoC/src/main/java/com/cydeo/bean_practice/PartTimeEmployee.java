package com.cydeo.bean_practice;

public class PartTimeEmployee implements Employee{
    @Override
    public void createAccrount() {
        System.out.println("Part time employee has been created!");
    }
}
