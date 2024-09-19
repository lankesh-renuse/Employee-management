package com.Employee.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Employee.Entity.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee ,Integer> {


}
