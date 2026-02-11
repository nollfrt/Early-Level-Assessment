package com.challenge.api.service;

import java.util.UUID;

public class EmployeeNotFoundException extends RuntimeException{
    public EmployeeNotFoundException(UUID uuid) {
        super("Employee with the following UUID not found: " + uuid);
    }
}
