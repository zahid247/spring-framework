package com.cydeo.repository;

import com.cydeo.model.Employee;
import com.cydeo.model.EmployeeRepository;
import org.springframework.stereotype.Component;

@Component
public class DBEmployeeRepository implements EmployeeRepository {



    @Override
    public int getHourlyRate() {
        Employee employee1 = new Employee("Zahid", "IT", 75);
        return employee1.getHourlyRate();
    }
}
