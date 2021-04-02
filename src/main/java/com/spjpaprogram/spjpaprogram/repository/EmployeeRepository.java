package com.spjpaprogram.spjpaprogram.repository;

import com.spjpaprogram.spjpaprogram.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    List<Employee> findByNameAndCity(String name,String city);
}
