package com.azuredb.controll;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.azuredb.entity.Employee;
import com.azuredb.repo.Repo;

@RestController
public class Controller {
	
	@Autowired
	private Repo repo;
	
	@GetMapping("/check")
	public String check() {
		return "correct";
	}
	
	@GetMapping("/emps")
	public List<Employee> getEmp(){
		List<Employee> emps = repo.findAll();
		return emps;
	}
	
	@PostMapping("/save")
	public Employee saveEmp(@RequestBody Employee emp) {
		Employee employee = repo.save(emp);
		return employee;
	}
	
	@GetMapping("/emp/{id}")
	public Employee getEmp(@PathVariable int id) {
		Employee emp = repo.findById(id).get();
		return emp;
	}
	
	
}
