package com.cydeo.service;

import com.cydeo.repository.EmployeeRepository;
import com.cydeo.repository.HoursRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OverTimeSalaryService {

    HoursRepository hoursRepository;
    EmployeeRepository employeeRepository;

    public OverTimeSalaryService(@Qualifier("OTH") HoursRepository hoursRepository, EmployeeRepository employeeRepository) {
        this.hoursRepository = hoursRepository;
        this.employeeRepository = employeeRepository;
    }

    public void calculateRegularSalary(){
        System.out.println("The salary is: " +
                employeeRepository.getHourlyRate() * (hoursRepository.getHours()));
    }

}
