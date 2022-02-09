package com.example.devicerent.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private int quantity;
    private double price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    @ManyToMany
    @JoinTable(name = "device-customer",
            joinColumns = {@JoinColumn(name = "device_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "customer_id", referencedColumnName = "id")}
    )
    private List<Customer> customers = new ArrayList<>();
}

