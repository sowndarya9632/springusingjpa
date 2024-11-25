package com.bridgelabz.h2database.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.h2database.entity.Employee;
import com.bridgelabz.h2database.repository.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(long id) {
		return employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("ID not found"));
	}
	
    @Override
	public Employee updateEmployee(long id, Employee employee) {
		Employee existingEmployee = employeeRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Employee with ID " + id + " not found"));

		existingEmployee.setfName(employee.getfName());
		existingEmployee.setlName(employee.getlName());
		existingEmployee.setAddress(employee.getAddress());
		existingEmployee.setAge(employee.getAge());
		return employeeRepository.save(existingEmployee);
	}
	@Override
    public void deleteEmployee(long id) {
        Employee existingEmployee = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee with ID " + id + " not found"));
        employeeRepository.delete(existingEmployee);
    }

}