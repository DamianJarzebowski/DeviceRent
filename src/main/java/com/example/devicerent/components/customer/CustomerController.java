package com.example.devicerent.components.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Scanner;

@Service
public class CustomerController {

    private Scanner scanner;
    private CustomerRepository customerRepository;

    @Autowired
    public CustomerController(Scanner scanner, CustomerRepository customerRepository) {
        this.scanner = scanner;
        this.customerRepository = customerRepository;
    }

    public void createCustomer() {
        Customer customer = readCustomer();
        customerRepository.save(customer);
        System.out.println("Dodano klienta" + " " + customer);
    }

    private Customer readCustomer() {
        Customer customer = new Customer();
        System.out.println("Podaj imię:");
        customer.setFirstName(scanner.nextLine());
        System.out.println("Podaj nazwisko:");
        customer.setLastName(scanner.nextLine());
        System.out.println("Podaj numer pesel:");
        customer.setPesel(scanner.nextLine());
        System.out.println("Podaj numer dowodu:");
        customer.setIdNumber(scanner.nextLine());
        return customer;
    }

    public void removeCustomer() {
        System.out.println("Podaj id klient, którego chcesz usunąć:");
        long customerId = scanner.nextLong();
        Optional<Customer> customer = customerRepository.findById(customerId);
        customer.ifPresentOrElse(customerRepository::delete, () -> System.out.println("Brak klienta o wskazanym ID"));
    }
}
