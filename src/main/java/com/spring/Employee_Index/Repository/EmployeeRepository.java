package com.spring.Employee_Index.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.Employee_Index.dto.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	

	List<Employee> findByEmployeeNameContainingOrPhoneNoContaining(String keyword, String keyword2);

	void deleteById(Long id);

	Optional<Employee> findById(Long id);

}
