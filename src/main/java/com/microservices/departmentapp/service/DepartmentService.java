package com.microservices.departmentapp.service;

import com.microservices.departmentapp.model.Department;
import com.microservices.departmentapp.repo.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService
{
    @Autowired
    private DepartmentRepo departmentRepo;


    public ResponseEntity<List<Department>> getAllDepartments()
    {
        List<Department> allDepartments = departmentRepo.findAll();
        return ResponseEntity.ok(allDepartments);
    }

    public ResponseEntity<Department> getDepartmentById(int deptId)
    {
        Department department = departmentRepo.findById(deptId).orElse(new Department());
        return ResponseEntity.ok(department);
    }

    public ResponseEntity<Department> addNewDepartment(Department department)
    {
        Department newDepartment = departmentRepo.save(department);
        return ResponseEntity.status(201).body(newDepartment);
    }

    public ResponseEntity<Department> updateDepartmentById(int deptId, Department updatedDepartmentData)
    {
        return departmentRepo.findById(deptId)
                .map(existingDepartment -> {
                    // Update fields
                    existingDepartment.setDepartmentName(updatedDepartmentData.getDepartmentName());
                    existingDepartment.setLocation(updatedDepartmentData.getLocation());
                    // Save updated department
                    Department updatedDepartment = departmentRepo.save(existingDepartment);
                    return ResponseEntity.ok(updatedDepartment);
                })
                .orElseGet(() -> ResponseEntity.status(404).body(null));
    }

    public ResponseEntity getDepartmentByLocation(String location)
    {
        List<Department> departmentList = departmentRepo.findByLocationLike(location);

        if(!departmentList.isEmpty())
            return ResponseEntity.ok(departmentList);
        else
            return ResponseEntity.notFound().build();
    }
}
