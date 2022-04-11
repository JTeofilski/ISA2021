package com.example.backend.controller;

import com.example.backend.model.dto.ShipOwnerDTO;
import com.example.backend.model.users.ShipOwner;
import com.example.backend.service.ShipOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/ship-owner", produces = MediaType.APPLICATION_JSON_VALUE)
public class ShipOwnerController {

    final private ShipOwnerService shipOwnerService;

    @Autowired
    public ShipOwnerController(ShipOwnerService shipOwnerService){

        this.shipOwnerService = shipOwnerService;
    }

    @GetMapping
    public ResponseEntity<List<ShipOwner>> findAll() {

        return ResponseEntity.ok().body(this.shipOwnerService.findAll());
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody ShipOwnerDTO shipOwnerDTO){
        try {
            return ResponseEntity.ok().body(shipOwnerService.create(shipOwnerDTO));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(400).body(e.getMessage());
        }
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody ShipOwner shipOwner){
        try {
            ShipOwner s = shipOwnerService.update(shipOwner);
            return new ResponseEntity<>(s, HttpStatus.OK);
        } catch (UsernameNotFoundException e) {
            return new ResponseEntity<>(e, HttpStatus.BAD_REQUEST);
        }
    }




}
