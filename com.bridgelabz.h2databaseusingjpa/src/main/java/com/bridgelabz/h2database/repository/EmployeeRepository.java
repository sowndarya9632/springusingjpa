package com.bridgelabz.h2database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.h2database.entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
