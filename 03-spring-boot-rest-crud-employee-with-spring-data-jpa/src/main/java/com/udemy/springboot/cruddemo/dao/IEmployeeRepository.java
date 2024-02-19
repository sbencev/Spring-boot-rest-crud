package com.udemy.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.springboot.cruddemo.entity.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

}
