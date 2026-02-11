package com.challenge.api.repository;

import com.challenge.api.model.Employee;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface EmployeeRepository {
    List<Employee> allEmployees();

    /**
     * Using Optional because search may not find anything
     *
     */
    Optional<Employee> findByUuid(UUID uuid);

    Employee save(Employee employee);
}
