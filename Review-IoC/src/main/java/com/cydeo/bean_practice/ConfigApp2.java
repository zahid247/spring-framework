package com.cydeo.bean_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigApp2 {

    @Bean(name = "name")
    public String str1(){
        return "Welcome to CydeoApp";
    }

    @Bean
    public String str2(){
        return "Spring Core Practice";
    }

}
