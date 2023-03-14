package com.cydeo;

import com.cydeo.config.ConfigApp;
import com.cydeo.repository.OverTime;
import com.cydeo.service.OverTimeSalaryService;
import com.cydeo.service.SalaryService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class);

        SalaryService salary = container.getBean(SalaryService.class);
        OverTimeSalaryService otss = container.getBean(OverTimeSalaryService.class);

        salary.calculateRegularSalary();
        otss.calculateRegularSalary();


    }

}
