package com.example.backend.controller;


import com.example.backend.model.users.Customer;
import com.example.backend.model.users.HouseOwner;
import com.example.backend.service.HouseOwnerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/house-owner", produces = MediaType.APPLICATION_JSON_VALUE)
public class HouseOwnerController {

    final private HouseOwnerService houseOwnerService;


    @PostMapping
    public ResponseEntity<?> create(@RequestBody HouseOwner houseOwner){
        try {
            return ResponseEntity.ok().body(houseOwnerService.create(houseOwner));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(400).body(e.getMessage());
        }
    }

}
