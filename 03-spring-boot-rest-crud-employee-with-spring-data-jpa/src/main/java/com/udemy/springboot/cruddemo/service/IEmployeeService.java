package com.udemy.springboot.cruddemo.service;

import java.util.List;

import com.udemy.springboot.cruddemo.entity.Employee;

public interface IEmployeeService {

	List<Employee> findAll();

	Employee findById(int theId);

	Employee save(Employee theEmployee);

	void deleteById(int theId);
}
