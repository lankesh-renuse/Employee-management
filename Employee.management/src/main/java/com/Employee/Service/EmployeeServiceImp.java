package com.Employee.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee.Dao.EmployeeDao;
import com.Employee.Entity.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService {
	
	
	@Autowired
	EmployeeDao dao ;
	

	@Override
	public Employee addEmployee(Employee emp) {
		return dao.save(emp) ;
	}

	@Override
	public List<Employee> getEmployee() {
		return dao.findAll() ;
	}

	@Override
	public Optional<Employee> getEmployee(int id) {
		return  this.dao.findById(id);
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		return dao.save(emp);
	}

	@Override
	public String deleteEmployee(int id) {
		Employee e = this.dao.getById(id);
		dao.delete(e);
		return "deleted";
	}

}
