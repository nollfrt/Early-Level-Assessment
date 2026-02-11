package com.challenge.api.model;

import java.time.Instant;
import java.util.UUID;

public class EmployeeImpl implements Employee{
    private UUID uuid;
    private String firstName;
    private String lastName;
    private String fullName; //might be able to get this from first/last
    private Integer salary;
    private Integer age;
    private String jobTitle;
    private String email;
    private Instant contractHireDate;
    private Instant contractTerminationDate;

    /**
     * Get the employee UUID
     * @return Employee's UUID
     */
    @Override
    public UUID getUuid() {
        return uuid;
    }

    /**
     * Set by either the Service or Data layer.
     * Set employee's UUID
     * @param uuid Desired UUID (required non-null)
     */
    @Override
    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    /**
     * Get employee's first name
     * @return Employee's first name
     */
    @Override
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets employee's first name
     * @param name Employee's desired first name
     */
    @Override
    public void setFirstName(String name) {
        this.firstName = name;
    }

    /**
     * Get employee's last name
     * @return employee's last name
     */
    @Override
    public String getLastName() {
        return lastName;
    }

    /**
     * Set employee's last name
     * @param name Employee's desired last name
     */
    @Override
    public void setLastName(String name) {
        this.lastName = name;
    }

    /**
     * Get employee's full name
     * @return employee's full name
     */
    @Override
    public String getFullName() {
        return fullName;
    }

    /**
     * Set employee's full name
     * @param name employee's desired full name
     */
    @Override
    public void setFullName(String name) {
        //TODO handle first and last name
        this.fullName = fullName;
    }

    /**
     * Get employee's salary
     * @return employee's salary
     */
    @Override
    public Integer getSalary() {
        return salary;
    }

    /**
     * Set employee's salary
     * @param salary employee's desired salary
     */
    @Override
    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    /**
     * Get employee's age
     * @return employee's age
     */
    @Override
    public Integer getAge() {
        return age;
    }

    /**
     * Set employee's age
     * @param age employee's desired age
     */
    @Override
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * Get employee's job title
     * @return employee's job title
     */
    @Override
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Set employee's job title
     * @param jobTitle employee's desired job title
     */
    @Override
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * Get employee's email
     * @return employee's email
     */
    @Override
    public String getEmail() {
        return email;
    }

    /**
     * Set employee's email
     * @param email desired employee email
     */
    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Get employee's contract hire date
     * @return employee's contract hire date
     */
    @Override
    public Instant getContractHireDate() {
        return contractHireDate;
    }

    /**
     * Set employee's contract hire date
     * @param date desired employee contract hire date
     */
    @Override
    public void setContractHireDate(Instant date) {
        this.contractHireDate = date;
    }

    /**
     * Nullable.
     * Get employee's contract termination date
     * @return null, if Employee has not been terminated. Otherwise, contract termination date
     */
    @Override
    public Instant getContractTerminationDate() {
        return contractTerminationDate;
    }

    /**
     * Set employee's contract termination date
     * @param date desired employee contract termination date
     */
    @Override
    public void setContractTerminationDate(Instant date) {
        this.contractTerminationDate = date;
    }
}
