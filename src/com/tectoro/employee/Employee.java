package com.tectoro.employee;

public class Employee {

	private Integer eid;
	private String ename;
	private String address;
	private Double esalary;
	private String dept;
	
	
	public Employee() {
		super();
	}


	public Employee(Integer eid, String ename, String address, Double esalary, String dept) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.address = address;
		this.esalary = esalary;
		this.dept = dept;
	}


	public Integer getEid() {
		return eid;
	}


	public void setEid(Integer eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Double getEsalary() {
		return esalary;
	}


	public void setEsalary(Double esalary) {
		this.esalary = esalary;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", address=" + address + ", esalary=" + esalary + ", dept="
				+ dept + "]";
	}
	
	
	
}
