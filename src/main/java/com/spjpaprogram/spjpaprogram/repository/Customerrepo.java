package com.spjpaprogram.spjpaprogram.repository;

import com.spjpaprogram.spjpaprogram.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Customerrepo extends JpaRepository<Customer,Integer> {
}
