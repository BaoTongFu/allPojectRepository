package com.btf.online.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.btf.online.dao.DepartmentDao;
import com.btf.online.entity.Department;
import com.btf.online.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentDao departmentDao;
	@Override
	public List<Department> queryDepartment() {
		return departmentDao.queryDepartment();
	}

}
