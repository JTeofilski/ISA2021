package com.example.backend.controller;

import com.example.backend.model.common.Address;
import com.example.backend.model.users.Customer;
import com.example.backend.model.users.User;
import com.example.backend.service.AddressService;
import com.example.backend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/address", produces = MediaType.APPLICATION_JSON_VALUE)
public class AddressController {

    private AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping
    public ResponseEntity<List<Address>> findAll() {
        return ResponseEntity.ok().body(this.addressService.findAll());
    }

    @PostMapping
    public ResponseEntity<Address> create(@RequestBody Address address){
        return ResponseEntity.ok().body(addressService.create(address));

    }

}
