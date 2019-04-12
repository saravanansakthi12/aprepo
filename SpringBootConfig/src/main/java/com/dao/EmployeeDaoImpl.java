package com.dao;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public Employee create(Employee employee) {
		
		entityManager.persist(employee);
		return employee;
	}

	@Override
	public List<Employee> listEmployee(Employee employee) {
		
		return entityManager.createQuery("from Employee").getResultList();
	}
	
	@Override
	public int deleteEmployee(int id) {
		
	 return entityManager.createNativeQuery("delete from employeedetails where emp_id = ?").setParameter(1,id).executeUpdate();
	}


	@Override
	public Employee editEmployee(int id, Employee employee) {
		
		List<Employee> list = entityManager.createQuery(" from Employee where emp_id = ?").setParameter(1,id).getResultList();
		Iterator i = list.iterator();
        Employee emp1 = null;
        while (i.hasNext()) {
              emp1 = (Employee) i.next();
              System.out.println(emp1.getEmpId());
              System.out.println(emp1.getEmpName());
        }
        return emp1;
	}

	@Override
	public int updateEmployee(Employee employee, int id) {
        int a = entityManager.createNativeQuery("update employeedetails set emp_name=?,emp_place=?,phone_no=? where emp_id=?")
                .setParameter(1, employee.getEmpName()).setParameter(2, employee.getEmpPlace())
                .setParameter(3, employee.getPhoneNo()).setParameter(4, id).executeUpdate();

    System.out.println(id);

    return a;

		
	}
	

}
