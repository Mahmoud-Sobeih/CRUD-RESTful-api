package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
