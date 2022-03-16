package com.example.devicerent.components.customer;

import com.example.devicerent.components.customer.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
