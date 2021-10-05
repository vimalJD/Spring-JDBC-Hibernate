package com.seed.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "employeev1", uniqueConstraints = { @UniqueConstraint(columnNames = { "eid" }) })
public class Employee {

	@Id
	@Column(name = "eid", nullable = false, unique = true, length = 20)
	private int empid;

	@Column(name = "ename", length = 20, nullable = true)
	private String empName;

	@Column(name = "erole", length = 20, nullable = true)
	private String empRole;

	@Column(name = "insert_time", nullable = true)
	private Date insertTime;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpRole() {
		return empRole;
	}

	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}

	public Date getInsertTime() {
		return insertTime;
	}

	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName
				+ ", empRole=" + empRole + ", insertTime=" + insertTime + "]";
	}

}
