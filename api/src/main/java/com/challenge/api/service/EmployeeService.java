package com.challenge.api.service;

import com.challenge.api.dto.CreateEmployeeRequest;
import com.challenge.api.model.Employee;
import com.challenge.api.model.EmployeeImpl;
import com.challenge.api.repository.EmployeeRepository;
import java.util.List;
import java.util.UUID;

public class EmployeeService {
    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public List<Employee> getAllEmployees() {
        return repository.allEmployees();
    }

    public Employee getEmployeeByUuid(UUID uuid) {
        return repository.findByUuid(uuid).orElseThrow(() -> new EmployeeNotFoundException(uuid));
    }

    public Employee createEmployee(CreateEmployeeRequest request) {
        EmployeeImpl employee = populateEmployeeFromRequest(request);

        // Set UUID (not checking for collisions since chance is EXTREMELY low
        employee.setUuid(UUID.randomUUID());

        return repository.save(employee);
    }

    private EmployeeImpl populateEmployeeFromRequest(CreateEmployeeRequest request) {
        EmployeeImpl employee = new EmployeeImpl();

        // populate employee with information inside the request
        employee.setFirstName(request.getFirstName());
        employee.setLastName(request.getLastName());
        employee.setSalary(request.getSalary());
        employee.setAge(request.getAge());
        employee.setJobTitle(request.getJobTitle());
        employee.setEmail(request.getEmail());
        employee.setContractHireDate(request.getContractHireDate());

        return employee;
    }
}
