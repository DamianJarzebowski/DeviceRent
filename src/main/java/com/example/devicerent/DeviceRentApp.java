package com.example.devicerent;


import com.example.devicerent.app.ApplicationController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;


@SpringBootApplication
public class DeviceRentApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(DeviceRentApp.class, args);
        ApplicationController controller = ctx.getBean(ApplicationController.class);
        controller.mainLoop();
    }

    @Bean
    public Scanner scanner() {
        return new Scanner(System.in);
    }


    }



