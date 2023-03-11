package com.MySpringBoot.MySbExample.repository;

import com.MySpringBoot.MySbExample.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository  extends JpaRepository<Department, Long>
{
}
