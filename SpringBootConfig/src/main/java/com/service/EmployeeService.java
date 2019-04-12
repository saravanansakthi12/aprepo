package com.service;

import java.util.List;

import com.model.Employee;

public interface EmployeeService {

	public Employee create(Employee employee);

	public List<Employee> listEmployee(Employee employee);

	public int deleteEmployee(int id);

	public Employee editEmployee(int id, Employee employee);

	public int updateEmployee(Employee employee, int id);

}
