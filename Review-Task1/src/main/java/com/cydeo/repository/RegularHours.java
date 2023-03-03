package com.cydeo.repository;

import com.cydeo.model.HoursRepository;
import org.springframework.stereotype.Component;

@Component
public class RegularHours implements HoursRepository {

    @Override
    public int getHours() {
        return 40;
    }
}
