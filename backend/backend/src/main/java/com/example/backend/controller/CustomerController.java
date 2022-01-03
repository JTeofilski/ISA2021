package com.example.backend.controller;

import com.example.backend.model.users.Customer;
import com.example.backend.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/customer", produces = MediaType.APPLICATION_JSON_VALUE)
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @PostMapping
    public ResponseEntity<Customer> create(@RequestBody Customer customer){
        return ResponseEntity.ok().body(customerService.create(customer));

    }
}
