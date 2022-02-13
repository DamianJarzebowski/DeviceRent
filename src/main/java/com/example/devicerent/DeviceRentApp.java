package com.example.devicerent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


import java.util.Scanner;

@SpringBootApplication
public class DeviceRentApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DeviceRentApp.class, args);

        /*
        var categoryRepository = context.getBean(CategoryRepository.class);
        var customerRepository = context.getBean(CustomerRepository.class);
        var deviceRepository = context.getBean(DeviceRepository.class);
         */



    }
}


