package com.example.backend.repository;

import com.example.backend.model.users.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CustomerRepository extends JpaRepository<Customer, UUID> {
    
    public Customer getCustomerByEmail(String email);
}
