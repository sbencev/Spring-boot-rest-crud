package com.udemy.springboot.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.springboot.cruddemo.dao.IEmployeeDAO;
import com.udemy.springboot.cruddemo.entity.Employee;

import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	private IEmployeeDAO employeeDAO;

	@Autowired
	public EmployeeServiceImpl(IEmployeeDAO theEmployeeDAO) {

		employeeDAO = theEmployeeDAO;

	}

	@Override
	public List<Employee> findAll() {

		return employeeDAO.findAll();

	}

	@Override
	public Employee findById(int theId) {

		return employeeDAO.findById(theId);
	}

	@Transactional
	@Override
	public Employee save(Employee theEmployee) {

		return employeeDAO.save(theEmployee);
	}

	@Transactional
	@Override
	public void deleteById(int theId) {

		employeeDAO.deleteById(theId);

	}

}
