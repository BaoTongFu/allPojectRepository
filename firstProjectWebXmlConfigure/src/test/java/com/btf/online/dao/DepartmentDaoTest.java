package com.btf.online.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.btf.online.BaseTest;
import com.btf.online.entity.Department;

public class DepartmentDaoTest extends BaseTest {
	@Autowired
	private DepartmentDao departmentDao;
	
	@Test
	public void testQueryDepartment() {
		List<Department> departments = departmentDao.queryDepartment();
		assertEquals(1, departments.size());
	}

}
