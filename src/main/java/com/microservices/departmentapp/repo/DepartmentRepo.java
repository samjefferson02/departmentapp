package com.microservices.departmentapp.repo;

import com.microservices.departmentapp.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepo extends JpaRepository<Department,Integer>
{
    public List<Department> findByLocationLike(String location);
}
