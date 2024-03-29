package com.example.demo.services;


import com.example.demo.models.Employee;
import com.example.demo.repository.EmployeeRepository;
import java.util.Optional;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author angeko
 */
@Data
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    
    public Optional<Employee> getEmployee(final Long id){
        return employeeRepository.findById(id);
    }
    
    public Iterable<Employee> getEmployees(){
        
        return employeeRepository.findAll();    }
    
    
    public void deleteEmployee(final Long id){
        employeeRepository.deleteById(id);
        
    }
    
    public Employee saveEmployee(Employee employee){
        Employee savedEmployee= employeeRepository.save(employee);
        return savedEmployee;
    }
}
