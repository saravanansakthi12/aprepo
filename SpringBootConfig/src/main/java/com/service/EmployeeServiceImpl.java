package com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmployeeDao;
import com.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeDao employeeDao;
	
	@Transactional
	public Employee create(Employee employee) {
		employee = employeeDao.create(employee);
		return employee;
	}

	@Transactional
	public List<Employee> listEmployee(Employee employee) {
		List<Employee> list = employeeDao.listEmployee(employee);		
		return list;
	}
	
	@Transactional
	public int deleteEmployee(int id) {
		System.out.println("Service id "+id);
		employeeDao.deleteEmployee(id);
		return id;
	}

	@Transactional
	public Employee editEmployee(int id, Employee employee) {
		return employeeDao.editEmployee(id,employee);
		
	}

	@Transactional
	public int updateEmployee(Employee employee, int id) {
		employeeDao.updateEmployee(employee,id);
		return id;
	}

}
