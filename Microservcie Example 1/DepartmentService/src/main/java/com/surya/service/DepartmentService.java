package com.surya.service;

import org.springframework.stereotype.Service;

import com.surya.entity.Department;
import com.surya.repository.DepartmentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DepartmentService
{
	
	
	private final DepartmentRepository departmentRepository;
	
	
	public Department saveDepartment(Department department) 
	{
		return departmentRepository.save(department);
	}
	
	public Department getDepartmentById(Long id) 
	{
		return departmentRepository.findById(id).get();
	}
	
}
