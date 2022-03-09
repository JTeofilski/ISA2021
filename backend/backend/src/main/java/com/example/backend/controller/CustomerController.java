package com.example.backend.controller;

import com.example.backend.model.dto.UserDTO;
import com.example.backend.model.users.Customer;
import com.example.backend.model.users.User;
import com.example.backend.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/customer", produces = MediaType.APPLICATION_JSON_VALUE)
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping
    public ResponseEntity<List<Customer>> findAll() {
        return ResponseEntity.ok().body(this.customerService.findAll());
    }


    @PostMapping
    public ResponseEntity<?> create(@RequestBody UserDTO userDTO){
        try {
            return ResponseEntity.ok().body(customerService.create(userDTO));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(400).body(e.getMessage());
        }
    }


   // @PreAuthorize("hasRole('ROLE_CUSTOMER')")
    @PutMapping
    public ResponseEntity<?> update(@RequestBody Customer customer){
        try {
            Customer c = customerService.update(customer);
            return new ResponseEntity<>(c, HttpStatus.OK);
        } catch (UsernameNotFoundException e) {
            return new ResponseEntity<>(e, HttpStatus.BAD_REQUEST);
        }
    }


}
