package com.MySpringBoot.MySbExample.controller;

import com.MySpringBoot.MySbExample.entity.Department;
import com.MySpringBoot.MySbExample.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController
{
    @Autowired
    private DepartmentService departmentService;
    @PostMapping("/departments")
    public Department saveDepartment (@RequestBody Department department)
    {
return departmentService.saveDepartment(department);
    }
    @GetMapping("/departments")
    public List<Department>fetchDepartmentList()
    {
        return departmentService.fetchDepartmentList();
    }
    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") long id)
    {
        return departmentService.fetchDepartmentById(id);

    }
    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") long id)
    {
        departmentService.deleteDepartmentById(id);
        return "department deleted sucessfully";

    }
    @PutMapping("/departments/{id}")
    public Department updateDepartment (@PathVariable("id") long id , @RequestBody Department department)
    {
        return departmentService.updateDepartment(id,department);

    }
}
