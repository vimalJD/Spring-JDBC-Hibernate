package com.seed.beans;

public class Employee {

	private int empID;
	private String empName;
	private Address address;
	private MyDate birthDate;
	private MyDate joinDate;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empID, String empName, Address address,
			MyDate birthDate, MyDate joinDate) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.address = address;
		this.birthDate = birthDate;
		this.joinDate = joinDate;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public MyDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(MyDate birthDate) {
		this.birthDate = birthDate;
	}

	public MyDate getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(MyDate joinDate) {
		this.joinDate = joinDate;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName
				+ ", address=" + address + ", birthDate=" + birthDate
				+ ", joinDate=" + joinDate + "]";
	}

}
