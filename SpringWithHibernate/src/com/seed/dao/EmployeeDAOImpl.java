package com.seed.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.seed.beans.Employee;

@Repository("employeeDao")
public class EmployeeDAOImpl extends AbstractDAO implements EmployeeDAO {

	public void saveEmployee(Employee employee) {
		persist(employee);
	}

	@SuppressWarnings("unchecked")
	public List<Employee> findAllEmployees() {
		Criteria criteria = getSession().createCriteria(Employee.class);
		return (List<Employee>) criteria.list();
	}

	public void updateEmployee(Employee employee) {
		getSession().update(employee);
	}

	@Override
	public void deleteEmployeeById(int id) {

		Query query = getSession().createQuery(
				"delete from Employee e where e.empid=?");
		query.setParameter(0, id);
		int i = query.executeUpdate();
		System.out.println("record deleted " + i);

		/*
		 * Employee e1 = (Employee) getSession().get(Employee.class,124);
		 * 
		 * getSession().delete(e1);
		 */
	}

	public Employee findById(int id) {

		Criteria criteria = getSession().createCriteria(Employee.class);
		criteria.add(Restrictions.eq("empid", id));
		return (Employee) criteria.uniqueResult();
	}

}
