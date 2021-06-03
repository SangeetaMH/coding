package com.example.demo1.Entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int dept_id;
	private String name;
	private int noofemployes;
	@OneToMany(mappedBy ="dept")
	 private List<Employee> emp=new ArrayList<>();
	public Department(int dept_id, String name, int noofemployes, List<Employee> emp) {
		super();
		this.dept_id = dept_id;
		this.name = name;
		this.noofemployes = noofemployes;
		this.emp = emp;
	}
	public Department() {
		super();
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoofemployes() {
		return noofemployes;
	}
	public void setNoofemployes(int noofemployes) {
		this.noofemployes = noofemployes;
	}
	public List<Employee> getEmp() {
		return emp;
	}
	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}
	
}
