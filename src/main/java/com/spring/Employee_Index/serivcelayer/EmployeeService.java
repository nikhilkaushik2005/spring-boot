package com.spring.Employee_Index.serivcelayer;


import java.util.List;

import com.spring.Employee_Index.dto.Employee;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
    Employee saveEmployee(Employee employee);
    void deleteEmployee(Long id);
    List<Employee> searchEmployees(String keyword);
}