package com.example.devicerent;

import com.example.devicerent.repository.CategoryRepository;
import com.example.devicerent.repository.CustomerRepository;
import com.example.devicerent.repository.DeviceRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class DeviceRentApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DeviceRentApp.class, args);

        var categoryRepository = context.getBean(CategoryRepository.class);
        var customerRepository = context.getBean(CustomerRepository.class);
        var deviceRepository = context.getBean(DeviceRepository.class);

        var dupa = new Scanner(System.in);
        dupa.nextLine();

    }
}


