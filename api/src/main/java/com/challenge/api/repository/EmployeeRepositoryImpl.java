package com.challenge.api.repository;

import com.challenge.api.model.Employee;

import java.util.*;

public class EmployeeRepositoryImpl implements EmployeeRepository{
    /**
     * Since we are not concerned with a persistence layer, I will use a Map to store Employees
     * Data Lookup is fast using uuid (keys)
     */
    private final HashMap<UUID, Employee> employeeMap = new HashMap<>();

    /**
     * Finds all employees and returns them in a list format
     * @return list of all employees
     */
    @Override
    public List<Employee> allEmployees() {
        return new ArrayList<>(employeeMap.values());
    }

    /**
     * Using Optional because search may not find anything
     *
     * @param uuid UUID of employee to be found
     * @return Optional object containing Employee if one was found
     */
    @Override
    public Optional<Employee> findByUuid(UUID uuid) {
        return Optional.ofNullable(employeeMap.get(uuid));
    }

    /**
     * @param employee is the employee to save into our repository
     * @return Employee that was saved
     */
    @Override
    public Employee save(Employee employee) {
        employeeMap.put(employee.getUuid(), employee);
        return null;
    }
}
