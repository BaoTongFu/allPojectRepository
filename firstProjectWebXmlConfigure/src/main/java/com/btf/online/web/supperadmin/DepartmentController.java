package com.btf.online.web.supperadmin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.btf.online.entity.Department;
import com.btf.online.service.DepartmentService;

@Controller
@RequestMapping("/superadmin")
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	@RequestMapping(value="listdepartment",method=RequestMethod.GET)
	@ResponseBody
	private Map<String, Object> queryDepartment(){
		Map<String, Object> modelMap = new HashMap<String, Object>();
		List<Department> list = new ArrayList<>();
		try {
			list = departmentService.queryDepartment();
			modelMap.put("rows", list);
			modelMap.put("total", list.size());
		}catch(Exception e) {
			e.printStackTrace();
			modelMap.put("success", false);
			modelMap.put("erMsg", e.toString());
		}
		return modelMap;
	}

}
