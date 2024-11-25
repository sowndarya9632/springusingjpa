package com.bridgelabz.h2database.service;

import java.util.List;

import com.bridgelabz.h2database.entity.Employee;

public interface EmployeeService {
	Employee addEmployee(Employee employee);

	List<Employee> getAllEmployee();

	Employee getEmployeeById(long id);

	Employee updateEmployee(long id, Employee employee);

	void deleteEmployee(long id);
}