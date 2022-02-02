package com.example.backend.service;

import com.example.backend.model.users.Customer;
import com.example.backend.model.users.Role;
import com.example.backend.model.users.User;
import com.example.backend.repository.CustomerRepository;
import com.example.backend.repository.RoleRepository;
import com.example.backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RequiredArgsConstructor
@Service
public class CustomerService {

    final private CustomerRepository customerRepository;
    final private PasswordEncoder encoder;
    final private RoleRepository roleRepository;
    final private EmailSender sender;

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public Customer create(Customer customer){

        Customer c = customerRepository.getCustomerByEmail(customer.getEmail());

        if (c != null) {
            throw new IllegalArgumentException("Email already exists!");
        }

        customer.setPassword(encoder.encode(customer.getPassword()));
        Set<Role> roles = new HashSet<>();
        Role role = roleRepository.getRoleByRoleName("ROLE_CUSTOMER");
        roles.add(role);
        customer.setRoles(roles);

        Customer newCustomer =  customerRepository.save(customer);

        sender.SendVerificationMailForCustomer(newCustomer.getEmail(), newCustomer.getUserId().toString());
        return newCustomer;
    }
}
