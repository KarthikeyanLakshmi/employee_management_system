package com.synapse.controller;

import com.synapse.model.Employee_Details;
import com.synapse.repository.Employee_Repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/employees")
@CrossOrigin(origins = "http://localhost:4200")
public class Employee_Controller {

    private final Employee_Repo employeeRepo;

    @Autowired
    public Employee_Controller(Employee_Repo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @PostMapping
    public ResponseEntity<Employee_Details> createEmployee(
        @RequestBody @Valid Employee_Details employee) {
        Employee_Details savedEmployee = employeeRepo.save(employee);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }
}