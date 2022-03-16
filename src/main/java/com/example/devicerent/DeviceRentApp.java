package com.example.devicerent;

import com.example.devicerent.components.category.Category;
import com.example.devicerent.components.device.Device;
import com.example.devicerent.components.category.CategoryRepository;
import com.example.devicerent.components.customer.CustomerRepository;
import com.example.devicerent.components.device.DeviceRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DeviceRentApp {

    public static void main(String[] args) {
        var context = SpringApplication.run(DeviceRentApp.class, args);

        var deviceRepository = context.getBean(DeviceRepository.class);
        var customerRepository = context.getBean(CustomerRepository.class);
        var categoryRepository = context.getBean(CategoryRepository.class);

        var device = new Device();
        device.setName("Wiertarka udarowa");
        device.setDescription("Wiertarka udarowa o dużej mocy 3000W z zestawem wierteł w komplecie");
        device.setPrice(80);
        device.setQuantity(5);


        var category = new Category();
        category.setName("Elektronarzędzia");
        category.setDescription("Wiertarki, szlifierki, młoty udarowe i inne elektronarzędzia");
        category = categoryRepository.save(category);

        var customer =  customerRepository.findById(1L).get();

        device.setCategory(category);
        device.addCustomer(customer);

        deviceRepository.save(device);

    }
}


