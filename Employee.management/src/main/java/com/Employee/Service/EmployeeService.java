package com.Employee.Service;

import java.util.List;
import java.util.Optional;

import com.Employee.Entity.Employee;

public interface EmployeeService {
	
	public Employee addEmployee( Employee emp);
	public List<Employee> getEmployee();
	public Optional<Employee> getEmployee(int id);
	public Employee updateEmployee(Employee emp);
	public String deleteEmployee(int id);

}
