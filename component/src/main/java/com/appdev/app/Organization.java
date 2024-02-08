package com.appdev.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.appdev.vo.Employee;

@Component
public class Organization
{
	@Autowired
	Employee employee;
	
	Organization()
	{
		System.out.println("employee object in constructor...."+employee);
	}
	
	public void getEmployee()
	{
		System.out.println("Employee object in getEmployee...."+employee);
	}
}
