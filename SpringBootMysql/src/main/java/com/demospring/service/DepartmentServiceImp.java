package com.demospring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demospring.entity.Department;
import com.demospring.repository.DepartmentRepository;

@Service
public class DepartmentServiceImp implements DepartmentService{

	@Autowired
	private DepartmentRepository departmentRepository;
	@Override
	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}

}
