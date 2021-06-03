package com.example.demo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.Entity.Employee;
import com.example.demo1.Repository.Employerepo;

@Service
public class Employeeservice {
	@Autowired
	private Employerepo repository;

	private Employee addemployee(Employee emp) {
		return repository.save(emp);

	}

	private List<Employee> saveall(List<Employee> emp) {
		return repository.saveAll(emp);

	}

	private Employee getproductbyid(int id) {
		return repository.findById(id).orElse(null);
	}

	private Employee updateEmployee(Employee emp) {
		return repository.save(emp);

	}

	private String deleteproduct(int id) {
		repository.deleteById(id);
		return "product removed" + id;
	}

}
