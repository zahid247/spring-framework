package com.cydeo.repository;

import com.cydeo.model.Hours;
import org.springframework.stereotype.Component;

@Component
public class OverTime implements Hours {

    @Override
    public int getHours() {
        return 15;
    }
}
