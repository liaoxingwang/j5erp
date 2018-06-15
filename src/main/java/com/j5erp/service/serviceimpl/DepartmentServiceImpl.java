package com.j5erp.service.serviceimpl;

import com.j5erp.entity.Department;
import com.j5erp.mapper.DepartmentMapper;
import com.j5erp.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    //部门
    @Autowired
    private DepartmentMapper departmentmapper;

    public void insertdepar(Department department){
        departmentmapper.insertdepar(department);
    }
}
