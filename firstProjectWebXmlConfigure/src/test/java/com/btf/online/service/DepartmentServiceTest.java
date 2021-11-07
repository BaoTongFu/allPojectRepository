package com.btf.online.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.btf.online.BaseTest;
import com.btf.online.entity.Department;

public class DepartmentServiceTest extends BaseTest {
	@Autowired
	private DepartmentService departmentService;
	
	@Test
	public void testQueryDepartment() {
		List<Department> departments=departmentService.queryDepartment();
		assertEquals(1, departments.size());
	}

}
