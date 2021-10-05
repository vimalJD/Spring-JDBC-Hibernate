package com.seed.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.seed.beans.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public String getEmployeeName(int id) {
		String sql = "select empname from empspr where empid = ?";
		String name = jdbcTemplate.queryForObject(sql, new Object[] { id },
				String.class);
		return name;
	}

	@Override
	public int addEmployee(Employee emp) {
		String sql = "insert into empspr values (?,?,?)";
		int i = jdbcTemplate.update(
				sql,
				new Object[] { emp.getEmpId(), emp.getEmpName(),
						emp.getEmpSalary() });
		return i;
	}

	@Override
	public int updateEmployee(Employee emp) {
		String sql = "update empspr set empsalary=? where empid=?";
		int i = jdbcTemplate.update(sql,
				new Object[] { emp.getEmpSalary(), emp.getEmpId() });
		return i;
	}

	@Override
	public int deleteEmployee(Employee emp) {
		String sql = "delete from empspr where empid=?";
		int i = jdbcTemplate.update(sql, new Object[] { emp.getEmpId() });
		return i;
	}

	@Override
	public List<Employee> getAllEmployeee() {
		
		String sql = "select * from empspr";
		List<Employee> empList = jdbcTemplate.query(sql, new RowMapper<Employee>(){

			@Override
			public Employee mapRow(ResultSet resultSet, int rowNum)
					throws SQLException {
				
				Employee employee = new Employee();
				employee.setEmpId(resultSet.getInt("empid"));
				employee.setEmpName(resultSet.getString("empname"));
				employee.setEmpSalary(resultSet.getDouble("empsalary"));
				return employee;
			}
			
		});
		return empList;
	}

}
