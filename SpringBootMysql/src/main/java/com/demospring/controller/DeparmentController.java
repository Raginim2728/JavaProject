package com.demospring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demospring.entity.Department;
import com.demospring.service.DepartmentService;

@RestController
public class DeparmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/departments")
	public Department saveDepartment(@RequestBody Department department) {
	        	
		return departmentService.saveDepartment(department);
	}

}
