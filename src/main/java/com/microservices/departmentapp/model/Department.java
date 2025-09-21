package com.microservices.departmentapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.boot.context.properties.bind.Name;

@Entity
@Data
public class Department
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Name("deptId")
    private int departmentId;

    private String departmentName;
    private String location;
}
