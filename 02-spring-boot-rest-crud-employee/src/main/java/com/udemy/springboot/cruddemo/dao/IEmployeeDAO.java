package com.udemy.springboot.cruddemo.dao;

import java.util.List;

import com.udemy.springboot.cruddemo.entity.Employee;

public interface IEmployeeDAO {

	List<Employee> findAll();

	Employee findById(int theId);

	Employee save(Employee theEmployee);

	void deleteById(int theId);

}
