package com.spjpaprogram.spjpaprogram.controller;

import com.spjpaprogram.spjpaprogram.model.Employee;
import com.spjpaprogram.spjpaprogram.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/saveEmployee")
    public String saveEmployee(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return "Employee saved";
    }

    @GetMapping("/getallemployees")
    public List<Employee> empList(){
        return employeeRepository.findAll();
    }

    @GetMapping("/getemployee/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Integer id){
        return employeeRepository.findById(id);
    }

    @PutMapping("/updateEmployee")
    public String updateEmployee(@RequestBody Employee employee){

        Optional<Employee> emp=employeeRepository
                .findById(employee.getId());

        emp.get().setName(employee.getName());
        emp.get().setCity(employee.getCity());

        employeeRepository.save(emp.get());
        return "Employee Updated";
    }

    @GetMapping("/employeedetails/{name}/{city}")
    public List<Employee> getEmployeeByNameAndCity(@PathVariable String name,
                                                   @PathVariable String city){
        return employeeRepository.findByNameAndCity(name,city);
    }

}
