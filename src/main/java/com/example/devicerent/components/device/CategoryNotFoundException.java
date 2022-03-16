package com.example.devicerent.components.device;

class CategoryNotFoundException extends RuntimeException {
    CategoryNotFoundException(String message) {
        super(message);
    }
}