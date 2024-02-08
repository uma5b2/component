package com.appdev.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/org")
public class OrgController
{
	@Autowired
	Organization org;
	
	@RequestMapping("/emp")
	public void getEmployee()
	{
		org.getEmployee();
	}
}
