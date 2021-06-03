package com.example.demo1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo1.Entity.Employee;

public interface Departmentrepo extends JpaRepository<Employee, Integer> {

}
