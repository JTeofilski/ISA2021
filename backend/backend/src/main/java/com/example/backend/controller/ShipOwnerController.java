package com.example.backend.controller;

import com.example.backend.model.users.Customer;
import com.example.backend.model.users.HouseOwner;
import com.example.backend.model.users.ShipOwner;
import com.example.backend.service.ShipOwnerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/ship-owner", produces = MediaType.APPLICATION_JSON_VALUE)
public class ShipOwnerController {

    final private ShipOwnerService shipOwnerService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody ShipOwner shipOwner){
        try {
            return ResponseEntity.ok().body(shipOwnerService.create(shipOwner));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(400).body(e.getMessage());
        }
    }



}
