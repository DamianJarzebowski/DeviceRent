package com.example.devicerent.app;

class InvalidOptionException extends RuntimeException {
    InvalidOptionException() {
        super("Opcja nie istnieje");
    }
}
