package com.Employee.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.Employee.Entity.Employee;
import com.Employee.Service.EmployeeService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService service ;
	
	@PostMapping("/Emp")
	public String saveEmp( @RequestBody Employee emp) {
		service.addEmployee(emp);
		return "Add Successfully";
	}
	
	@GetMapping("/Emp")
	public List<Employee> getEmployee(){
		return service.getEmployee();		
	}
	
	@GetMapping("Emp/{id}")
	public Optional<Employee> getEmployeeByID(@PathVariable("id") String id ){
		return service.getEmployee(Integer.parseInt(id));
	}
	
	@PutMapping("/Emp")
	public String updateEmployee(@RequestBody Employee emp) {
		service.updateEmployee(emp);
		return "updated";
	}
	
	@DeleteMapping("/Emp/{id}")
	public String  deleteEmp(@PathVariable("id") String id )  {
	   service.deleteEmployee(Integer.parseInt(id));
	   return "deleted";
	}
		
	

}
