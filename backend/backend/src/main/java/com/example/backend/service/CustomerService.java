package com.example.backend.service;

import com.example.backend.model.users.Customer;
import com.example.backend.model.users.Role;
import com.example.backend.repository.CustomerRepository;
import com.example.backend.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
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

    public Customer update(Customer customer){
        Customer c = customerRepository.getCustomerByEmail(customer.getEmail());

        if (c == null) {
            throw new UsernameNotFoundException("User not found in database!");
        }

        c.setPassword(customer.getPassword());
        c.setFirstName(customer.getFirstName());
        c.setLastName(customer.getLastName());
        c.setPhoneNumber(customer.getPhoneNumber());
        c.setAddress(customer.getAddress());

        return customerRepository.save(c);
    }
}
