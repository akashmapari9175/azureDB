package com.azuredb.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.azuredb.entity.Employee;

public interface Repo extends JpaRepository<Employee, Integer> {

}
