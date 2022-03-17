package com.example.devicerent.components.category;

import com.example.devicerent.components.device.Device;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name="category")
@Getter
@Setter
@EqualsAndHashCode
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @Column(length = 1024)
    private String description;

    @Override
    public String toString() {
        return "Kategoria{" +
                "id=" + id +
                ", nazwa='" + name + '\'' +
                ", opis='" + description + '\'' +
                '}';
    }
}
