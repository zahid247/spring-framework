package com.cydeo.service;

import com.cydeo.repository.DBEmployeeRepository;
import com.cydeo.repository.OverTime;
import com.cydeo.repository.RegularHours;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class Salary {

    DBEmployeeRepository employeeRepository;
    RegularHours regularHours;
    OverTime overTime;

    public void calculateRegularSalary(){
        System.out.println("The salary is: " +
                employeeRepository.getHourlyRate() * (regularHours.getHours() + overTime.getHours()));
    }
}
