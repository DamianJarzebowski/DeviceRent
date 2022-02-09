package com.example.devicerent.repository;

import com.example.devicerent.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
