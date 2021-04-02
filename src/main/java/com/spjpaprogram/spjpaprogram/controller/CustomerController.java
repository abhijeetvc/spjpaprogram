package com.spjpaprogram.spjpaprogram.controller;

import com.spjpaprogram.spjpaprogram.model.Customer;
import com.spjpaprogram.spjpaprogram.repository.Customerrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private Customerrepo customerrepo;

    @PostMapping("/savecustomer")
    public String saveCustomer(@RequestBody Customer customer){
        customerrepo.save(customer);
        return "Customer saved";
    }
}
