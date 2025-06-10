package com.spring.Employee_Index.dto;


import jakarta.persistence.*;


@Entity
@Table(name = "employees")

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String employeeCode;
    
    @Column(nullable = false)
    private String employeeName;
    
    private String address;
    private String dateOfBirth;
    private String phoneNo;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getEmployeeCode() {
        return employeeCode;
    }
    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", employeeCode=" + employeeCode + ", employeeName=" + employeeName + ", address="
                + address + ", dateOfBirth=" + dateOfBirth + ", phoneNo=" + phoneNo + "]";
    }


    


    


    
}
