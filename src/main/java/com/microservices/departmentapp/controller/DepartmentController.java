package com.microservices.departmentapp.controller;

import com.microservices.departmentapp.model.Department;
import com.microservices.departmentapp.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController
{
    @Autowired
    private DepartmentService departmentService;

    @GetMapping
    public ResponseEntity<List<Department>> getDepartments()
    {
        return departmentService.getAllDepartments();
    }

    @GetMapping("/{deptId}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable Integer deptId)
    {
        return departmentService.getDepartmentById(deptId);
    }

    @GetMapping("/searchLocation{location}")
    public ResponseEntity<Department> getDepartmentById(@RequestParam String location)
    {
        return departmentService.getDepartmentByLocation(location);
    }

    @PostMapping("/addDepartment")
    public ResponseEntity<Department> addDepartment(@RequestBody Department department)
    {
        return departmentService.addNewDepartment(department);
    }

    @PutMapping("/updateDepartment/{deptId}")
    public ResponseEntity<Department> updateDepartment(@PathVariable int deptId,@RequestBody Department updatedDepartmentData)
    {
        return departmentService.updateDepartmentById(deptId,updatedDepartmentData);
    }
}
