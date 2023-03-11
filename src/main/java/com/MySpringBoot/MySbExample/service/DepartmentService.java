package com.MySpringBoot.MySbExample.service;

import com.MySpringBoot.MySbExample.entity.Department;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DepartmentService
{
    Department saveDepartment(Department department);

   public List<Department> fetchDepartmentList();

   public Department fetchDepartmentById(long id);

    public void deleteDepartmentById(long id);

   public  Department updateDepartment(long id, Department department);
}
