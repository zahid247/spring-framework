package com.cydeo.service;

import com.cydeo.repository.OverTime;
import com.cydeo.repository.EmployeeRepository;
import com.cydeo.repository.HoursRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SalaryService {

    EmployeeRepository employeeRepository;
    HoursRepository hoursRepository;

    public SalaryService(EmployeeRepository employeeRepository, @Qualifier("RH") HoursRepository hoursRepository) {
        this.employeeRepository = employeeRepository;
        this.hoursRepository = hoursRepository;
    }

    public void calculateRegularSalary(){
        System.out.println("The salary is: " +
                employeeRepository.getHourlyRate() * (hoursRepository.getHours()));
    }

}
