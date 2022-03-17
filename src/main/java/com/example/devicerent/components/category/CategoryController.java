package com.example.devicerent.components.category;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.Locale;
import java.util.Scanner;

@Service
@RequiredArgsConstructor
public class CategoryController {

    private final Scanner scanner;
    private final CategoryRepository categoryRepository;

    public void createCategory() {
        Category category = readCategory();
        try {
            categoryRepository.save(category);
            System.out.println("Dodano kategorię" + " " + category);
        } catch (DataIntegrityViolationException e) {
            System.err.println("Nie dodano kategorii, możliwe, żenazwa jest duplikatem.");
        }

    }

    private Category readCategory() {
        var category = new Category();
        System.out.println("Podaj nazwę kategorii:");
        category.setName(scanner.nextLine().toUpperCase(Locale.ROOT));
        System.out.println("Podaj opis kategorii:");
        category.setDescription(scanner.nextLine());
        return category;
    }

    public void removeCategory() {
        System.out.println("Podaj id katgorii, którą chcesz usunąć:");
        var categoryId = scanner.nextLong();
        var category = categoryRepository.findById(categoryId);
        category.ifPresentOrElse(categoryRepository::delete, () -> System.out.println("Brak kategorii o wskazanym ID"));
    }
}
