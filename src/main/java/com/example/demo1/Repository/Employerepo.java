package com.example.demo1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo1.Entity.Employee;

public interface Employerepo extends JpaRepository<Employee, Integer> {

}
