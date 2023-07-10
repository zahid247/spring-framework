package com.cydeo.bootstrap;

import com.cydeo.repository.AccountRepository;
import org.springframework.boot.CommandLineRunner;

public class DataGenerator implements CommandLineRunner {

    private final AccountRepository accountRepository;

    public DataGenerator(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    @Override
    public void run(String... args) throws Exception{

    }

}
