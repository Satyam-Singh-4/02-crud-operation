package com.tectoro.employee.service;

import java.util.ArrayList;

import com.tectoro.employee.Employee;

public class EmployeeService implements  EmployeeServiceInterface{

	@Override
	public void display(ArrayList<Employee> emp) {
		emp.forEach((ele)->System.out.println(ele));

		
	}
	
}
