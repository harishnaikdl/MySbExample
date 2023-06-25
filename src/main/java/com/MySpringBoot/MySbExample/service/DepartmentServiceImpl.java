package com.MySpringBoot.MySbExample.service;

import com.MySpringBoot.MySbExample.entity.Department;
import com.MySpringBoot.MySbExample.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements  DepartmentService
{
@Autowired
private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentById(long id) {
        return departmentRepository.findById(id).get();
    }

    @Override
    public void deleteDepartmentById(long id) {
        departmentRepository.deleteById(id);
    }

    @Override
    public Department updateDepartment(long id, Department department) {
        Department depDB = departmentRepository.findById(id).get();
        if(Objects.nonNull(department.getName())&&
                !"".equalsIgnoreCase(department.getName()))
        {
            depDB.setName(department.getName());

        }
        if(Objects.nonNull(department.getAddress())&&
                !"".equalsIgnoreCase(department.getAddress()))
        {
            depDB.setAddress(department.getAddress());

        }
        if(Objects.nonNull(department.getEmail())&&
                !"".equalsIgnoreCase(department.getEmail()))
        {
            depDB.setEmail(department.getEmail());

        }
        return departmentRepository.save(depDB);
    }
}
