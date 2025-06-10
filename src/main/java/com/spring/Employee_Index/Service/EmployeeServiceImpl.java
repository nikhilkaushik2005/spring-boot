package com.spring.Employee_Index.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.Employee_Index.Repository.EmployeeRepository;
import com.spring.Employee_Index.dto.Employee;
import com.spring.Employee_Index.serivcelayer.EmployeeService;

import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
    
    

    @Override
    @Transactional  // Add this annotation to ensure a transaction is active
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
    @Override
    public List<Employee> searchEmployees(String keyword) {
        return employeeRepository.findByEmployeeNameContainingOrPhoneNoContaining(keyword, keyword);
    }
}
